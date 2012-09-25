package pe.com.munmiraflores.gestiondocumental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection; 

import pe.com.munmiraflores.gestiondocumental.domain.Estados;
import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;
import pe.com.munmiraflores.gestiondocumental.domain.Tareas;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.util.ConexionBD; 

public class SeguimientoDAO extends BaseDAO {

	public Collection<Seguimiento> listarSeguimiento(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion {
		System.out.println("SeguimientoDAO: ListarSeguimiento()");
		String query = "Select S.DOCCOD, " +
				"       S.SEGCOD AS ITM , S.SEGFCH AS FECHA , S.SEGHRA AS HORA , " +
				"       T.TARDSC AS TAREA , E.STSDSC AS ESTADO , " +
				"       CONCAT(U1.UNIORGSIG, '-', C1.CARDSC, '-', T1.TRBAPENOM) UO_ORIGEN, " +
				"       CONCAT(U2.UNIORGSIG, '-', C2.CARDSC, '-', T2.TRBAPENOM) UO_DESTINO, " +
				"       CONCAT(R.USRAPEPAT,R.USRAPEMAT,R.USRNOM) USUARIO, " +
				"       S.SEGGLO AS GLOSA_SEGUIMIENTO " +
				"from TDDDOC02 s, tdbtar01 T , TDBEST01 E , rhduor01 U1 , rhduor01 U2 , rhbcar01 C1 , " +
				"     rhbcar01 C2 , rhdtrb01 T1 , rhdtrb01 T2, NSBUSR01 R , tdddoc01 d " +
				"where S.TARCOD = T.TARCOD AND S.SEGSTSCOD = E.STSCOD and S.SEGUOORICO = U1.uniorgcod " +
				"      and S.SEGUODESCO = U2.uniorgcod AND S.SEGCARORIC = C1.CARCOD  AND S.SEGCARDESC=C2.CARCOD " +
				"      and S.SEGEMPORIC = T1.TRBCOD AND S.SEGEMPDESC = T2.TRBCOD AND S.SEGUSR = R.USRCOD " +
				"      and S.DOCCOD=D.DOCCOD " +
				"      AND D.DOCANONUM = ? " +
				"      AND D.DOCCOR = ? " +
				"      and D.TPODOCCOD = ? " +
				"ORDER BY S.SEGCOD DESC";
				//"SELECT idtipousuario,descripcion FROM tipousuario";
		Collection<Seguimiento> listaSeguimiento = new ArrayList<Seguimiento>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, docanonum);
			stmt.setInt(2, doccor);
			stmt.setString(3, tpodoccod);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Seguimiento objSeguimiento = new Seguimiento();
				objSeguimiento.setDoccod(rs.getInt("DOCCOD"));
				objSeguimiento.setSegcod(rs.getInt("ITM"));
				objSeguimiento.setSegfch(rs.getString("FECHA"));
				objSeguimiento.setSeghra(rs.getString("HORA"));
				Tareas objTareas = new Tareas();
				objTareas.setTardsc(rs.getString("TAREA"));
				objSeguimiento.setTareas(objTareas);
				Estados objEstados = new Estados();
				objEstados.setStsdsc(rs.getString("ESTADO"));
				objSeguimiento.setEstados(objEstados);
				objSeguimiento.setOrigen(rs.getString("UO_ORIGEN"));
				objSeguimiento.setDestino(rs.getString("UO_DESTINO"));
				objSeguimiento.setUsuario(rs.getString("USUARIO"));
				objSeguimiento.setSegglo(rs.getString("GLOSA_SEGUIMIENTO"));
				listaSeguimiento.add(objSeguimiento);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return listaSeguimiento;
	}
}
