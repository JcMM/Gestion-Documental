package pe.com.munmiraflores.gestiondocumental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection; 
import java.util.List;

import pe.com.munmiraflores.gestiondocumental.domain.Anexo;
import pe.com.munmiraflores.gestiondocumental.domain.DetRecibo;
import pe.com.munmiraflores.gestiondocumental.domain.Estados;
import pe.com.munmiraflores.gestiondocumental.domain.Recibos;
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
		List<Seguimiento> listaSeguimiento = new ArrayList<Seguimiento>();
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
	
	
	public Recibos getRecibo(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion {
		System.out.println("SeguimientoDAO: getRecibo()");
		String query = "select R.DOCCOD, "+
				       "R.DOCRECITM AS ITEM,R.DOCRECTPO AS TIPO, "+
				       "R.DOCRECSER AS SERIE,R.DOCRECNRO AS COMPROBANTE, R.DOCRECMNT AS MONTO, "+
				       "R.DOCRECFPAG AS FECHA, "+
				       "R.DOCRECFACT "+
				       "from tdddoc06 R, TDDDOC01 D "+
				       "where R.DOCCOD = D.DOCCOD AND "+
				       "D.TPODOCCOD = ? AND "+
				       "D.DOCANONUM = ? AND "+
				       "D.DOCCOR = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Recibos objRecibo= null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, tpodoccod);
			stmt.setInt(2, docanonum);
			stmt.setInt(3, doccor);
			rs = stmt.executeQuery();
			System.out.println( "ejecutando + " + query );
			if (rs.next()) {	
				System.out.println("while");
				objRecibo = new Recibos();
				objRecibo.setDoccod(rs.getInt("DOCCOD"));
				objRecibo.setDocrecitm( rs.getInt("ITEM") );				
				objRecibo.setDocrectpo(rs.getInt("TIPO"));
				objRecibo.setDocrecser(rs.getInt("SERIE"));
				objRecibo.setDocrecnro(rs.getInt("COMPROBANTE"));
				objRecibo.setDocrecmnt( Double.parseDouble(rs.getString("MONTO")) );
				objRecibo.setDocrecfecc(rs.getString("FECHA"));
				objRecibo.setDocrecfact(rs.getInt("DOCRECFACT"));				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOExcepcion(e.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return objRecibo;
	}
	
	public List<DetRecibo> getDetalleRecibo(Integer docanonum  ) throws DAOExcepcion {
		System.out.println("SeguimientoDAO: getRecibo()");
		String query = "select  F.TFACTID, "+
        			" F.TCCPDET AS CONCEPTO_DE_PAGO, F.TFACTOTAL AS IMPORTE "+
        			" from detrec F , tdddoc06 R "+
        			" WHERE F.TFACTID = R.DOCRECFACT AND"+  
        			" R.DOCRECFACT = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		DetRecibo objRecibo= null;
		List<DetRecibo> lista = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, docanonum);
			rs = stmt.executeQuery();
			lista = new ArrayList<DetRecibo>();
			while (rs.next()) {				
				objRecibo = new DetRecibo();
				objRecibo.setDoccod(rs.getInt("TFACTID"));
				objRecibo.setConcepto(rs.getString("CONCEPTO_DE_PAGO"));
				objRecibo.setImporte(Double.parseDouble( rs.getString("IMPORTE") ));
				lista.add(objRecibo);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
	
	public List<Anexo> getAnexos(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion {
		System.out.println("SeguimientoDAO: getRecibo()");
		String query = "select " + 
				      " CONCAT(D.TPODOCCOD, '-', D.DOCANONUM, '-', D.DOCCOR) NRO_DOCUMENTO," + 
				      " R.RELDOCFINI AS FECH_INICIO,R.RELDOCFFIN AS FECH_FIN,U.UNIORGSIG AS UO_ORIGEN," + 
				      " D.DOCASU AS ASUNTO ,R.RELDOCOBS AS OBSERVACION,D.DOCUBIFOL AS UBICACION_FOLIO" + 
						" from tddrdo01 R" + 
						" INNER JOIN tdddoc01 T ON T.DOCCOD = R.RELDOCPDEC" + 
						" INNER JOIN TDDDOC01 D ON D.DOCCOD = R.RELDOCHJOC" + 
						" INNER JOIN RHDUOR01 U ON U.UNIORGCOD = D.DOCUOORICO" + 
						" where" + 
						" R.RELDOCFFIN = STR_TO_DATE('2039-12-31','%Y-%m-%d') AND R.TRELCOD = 1" + 
						" AND T.TPODOCCOD = ?" + 
						" AND T.DOCANONUM = ?" + 
						" AND T.DOCCOR = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Anexo obj= null;
		List<Anexo> lista = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, tpodoccod);
			stmt.setInt(2, docanonum);
			stmt.setInt(3, doccor);
			rs = stmt.executeQuery();
			lista = new ArrayList<Anexo>();
			while (rs.next()) {				
				obj = new Anexo();
				obj.setAsunto( rs.getString("ASUNTO"));
				obj.setFecFin( rs.getString("FECH_FIN"));
				obj.setFecInicio(rs.getString("FECH_INICIO"));
				obj.setNroDocumento(rs.getString("NRO_DOCUMENTO"));
				obj.setObservacion(rs.getString("OBSERVACION"));
				obj.setOrigen(rs.getString("UO_ORIGEN"));
				obj.setUbicacionFolio(rs.getString("UBICACION_FOLIO"));
				lista.add(obj);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}
	
}
