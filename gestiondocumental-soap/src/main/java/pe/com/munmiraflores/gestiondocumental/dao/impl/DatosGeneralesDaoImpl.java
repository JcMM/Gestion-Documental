package pe.com.munmiraflores.gestiondocumental.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pe.com.munmiraflores.gestiondocumental.dao.BaseDAO;
import pe.com.munmiraflores.gestiondocumental.dao.DatosGeneralesDAO;
import pe.com.munmiraflores.gestiondocumental.domain.Cargo;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;
import pe.com.munmiraflores.gestiondocumental.domain.Estadistico;
import pe.com.munmiraflores.gestiondocumental.domain.Estados;
import pe.com.munmiraflores.gestiondocumental.domain.Personas;
import pe.com.munmiraflores.gestiondocumental.domain.UnidadOrganica;
import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.util.ConexionBD;

public class DatosGeneralesDaoImpl extends BaseDAO implements DatosGeneralesDAO  {

	public Documentos getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion {
		System.out.println("DatosGeneralesDAO: getDatosGenerales()");
		String query = "select d.tpodoccod, d.doccor, d.docanonum, " +
				"       d.docfchcre FEC_INGRESO, E.STSDSC ESTADO, " +
				"       D.DOCSOLNCMP SOLICITANTE , S.DNI DNI, S.RUC RUCM, " +
				"       D.DOCASU ASUNTO, D.DOCNUMFOL FOLIO, " +
				"       D.DOCUOACTCO, U.UNIORGNOM UO_ACTUAL, " +
				"       D.DOCCARACTC, C.CARDSC CARGO_ACTUAL, " +
				"       D.Docdirfisc DIRE_FISCAL, D.DOCDIRCORC DIR_CORRESPONDENCIA,D.DVIGUCDIR DIR_INMUEBLE, " +
				"       D.DOCOBS AS OBSERVACIONES, " +
				"       D.DOCFLGHC AS HOJA_DE_CARGO, D.DOCFLGANX AS ANEXADO, D.DOCFLGARC AS ARCHIVADO, " +
				"       D.DOCUSRCRE, O.USRLOG AS USUARIO_CREACIO, D.DOCFCHCRE AS FEC_CREACION, " +
				"       D.DOCUSRMOD, m.usrlog as USUARIO_MODIFICA, D.DOCFCHMOD AS FEC_MOD " +
				"from tdddoc01 d, TDBEST01 E, IGRNTF03 S, RHDUOR01 U,rhbcar01 C, NSBUSR01 O, NSBUSR01 M " +
				"WHERE D.DOCSTSCOD = E.STSCOD AND D.DOCSOLCON = S.CON AND D.DOCUOACTCO= U.UNIORGCOD " +
				"  AND D.DOCCARACTC= C.CARCOD AND D.DOCUSRCRE= O.USRCOD AND d.docusrmod = m.usrcod " +
				"      AND D.DOCANONUM = ? " +
				"      AND D.DOCCOR = ? " +
				"      and D.TPODOCCOD = ?";
				//"SELECT idtipousuario,descripcion FROM tipousuario";
		//Collection<Documentos> documentos = new ArrayList<Documentos>();
		Documentos objDocumentos = new Documentos();
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
				//objDocumentos.setTiponumeroanio(rs.getString("TIPO_NUMERO_ANNO"));
				objDocumentos.setTpodoccod(rs.getString("tpodoccod"));
				objDocumentos.setDoccor(rs.getInt("doccor"));
				objDocumentos.setDocanonum(rs.getInt("docanonum"));
				objDocumentos.setDocfchcre(rs.getString("FEC_INGRESO"));
				Estados objEstados = new Estados();
				objEstados.setStsdsc(rs.getString("ESTADO"));
				objDocumentos.setEstados(objEstados);
				objDocumentos.setDocsolncmp(rs.getString("SOLICITANTE"));
				Personas objPersonas = new Personas();
				objPersonas.setDni(rs.getString("DNI"));
				objPersonas.setRuc(rs.getString("RUCM"));
				objDocumentos.setPersonas(objPersonas);
				objDocumentos.setDocasu(rs.getString("ASUNTO"));
				objDocumentos.setDocnumfol(rs.getInt("FOLIO"));
				objDocumentos.setDocuoactco(rs.getInt("DOCUOACTCO"));
				UnidadOrganica objUnidadOrganica = new UnidadOrganica();
				objUnidadOrganica.setUniorgnom(rs.getString("UO_ACTUAL"));
				objDocumentos.setUnidadOrganica(objUnidadOrganica);
				objDocumentos.setDoccaractc(rs.getInt("DOCCARACTC"));
				Cargo objCargo = new Cargo();
				objCargo.setCardsc(rs.getString("CARGO_ACTUAL"));
				objDocumentos.setCargo(objCargo);
				objDocumentos.setDocdirfisc(rs.getString("DIRE_FISCAL"));
				objDocumentos.setDocdircorc(rs.getString("DIR_CORRESPONDENCIA"));
				objDocumentos.setDvigucdir(rs.getString("DIR_INMUEBLE"));
				objDocumentos.setDocobs(rs.getString("OBSERVACIONES"));
				objDocumentos.setDocflghc(rs.getInt("HOJA_DE_CARGO"));
				objDocumentos.setDocflganx(rs.getInt("ANEXADO"));
				objDocumentos.setDocflgarc(rs.getInt("ARCHIVADO"));
				objDocumentos.setDocusrcre(rs.getInt("DOCUSRCRE"));
				Usuarios objUsuariosa = new Usuarios();
				objUsuariosa.setUsrlog(rs.getString("USUARIO_CREACIO"));
				objDocumentos.setUsuariosa(objUsuariosa);
				objDocumentos.setDocfchcre(rs.getString("FEC_CREACION"));
				objDocumentos.setDocusrmod(rs.getInt("DOCUSRMOD"));
				Usuarios objUsuariosb = new Usuarios();
				objUsuariosb.setUsrlog(rs.getString("USUARIO_MODIFICA"));
				objDocumentos.setUsuariosb(objUsuariosb);
				objDocumentos.setDocfchmod(rs.getString("FEC_MOD"));
				//listaSeguimiento.add(objSeguimiento);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return objDocumentos;
	}

	
	public List<Estadistico> estadisticoPorEstado( ) throws DAOExcepcion {
		System.out.println("DatosGeneralesDAO: estadisticoPorEstado()");
		String query = "SELECT DISTINCT   e.stsdscabv ,d.tpodoccod, count(d.tpodoccod) as cantidad "+
					" from tdddoc01 d "+
					" INNER JOIN tdbest01 e  ON d.docstscod = e.stscod "+
					" where d.docanonum=2012 and d.tpodoccod in ('EXPE','CEXT','SOLI') "+
					" group by  e.stsdscabv , d.tpodoccod "+
					" order by e.stsdscabv asc, d.tpodoccod ";
		Estadistico objeto = new Estadistico();
		List<Estadistico> lista = new ArrayList<Estadistico>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				objeto = new Estadistico();
				objeto.setCantidad(rs.getInt( "cantidad" ));
				objeto.setTipo(rs.getString("tpodoccod"));
				objeto.setEstado(rs.getString("stsdscabv"));
				lista.add(objeto);
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
	

	
	public List<Estadistico> estadisticoPorUnidadOrganica( ) throws DAOExcepcion {
		System.out.println("DatosGeneralesDAO: estadisticoPorUnidadOrganica()");
		String query = "SELECT DISTINCT  d.docuoactco,u.uniorgnom,d.tpodoccod, count(*) as cantidad "+
						" from tdddoc01 d "+
						" INNER JOIN rhduor01 u  ON u.uniorgcod =  d.docuoactco "+
						" where d.docanonum=2012 and d.tpodoccod in ('EXPE','CEXT','SOLI') "+
						" group by  d.docuoactco,u.uniorgnom,d.tpodoccod "+
						" order by d.docuoactco asc,u.uniorgnom,d.tpodoccod asc ";
		Estadistico objeto = new Estadistico();
		List<Estadistico> lista = new ArrayList<Estadistico>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				objeto = new Estadistico();
				objeto.setCantidad(rs.getInt( "cantidad" ));
				objeto.setTipo(rs.getString("tpodoccod"));
				objeto.setDocuoactco(rs.getInt("docuoactco"));
				objeto.setUnidad(rs.getString("uniorgnom"));
				lista.add(objeto);
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

