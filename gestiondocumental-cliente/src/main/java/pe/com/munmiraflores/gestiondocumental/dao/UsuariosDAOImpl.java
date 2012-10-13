package pe.com.munmiraflores.gestiondocumental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import pe.com.munmiraflores.gestiondocumental.domain.UsuariosSystem;

@Repository
public class UsuariosDAOImpl  extends BaseDAO implements UsuarioDao{

	@Override
	public UsuariosSystem obtenerUsuarioPorUsername(String username) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		UsuariosSystem usr = null;
		try {
			
			String query = "Select * from nsbusr01 where usrlog = ? ";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, username);
			rs = stmt.executeQuery();
			if (rs.next()) {
				usr = new UsuariosSystem(rs.getString("usrlog"), rs.getString("clave"), rs.getInt("estado")==1?true:false, UsuariosSystem.uno() );
				usr.setUsrapepat( rs.getString("usrapepat"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return usr;
	}

}
