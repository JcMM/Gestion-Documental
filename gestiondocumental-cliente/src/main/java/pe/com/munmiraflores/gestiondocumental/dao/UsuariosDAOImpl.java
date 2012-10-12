package pe.com.munmiraflores.gestiondocumental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;

@Repository
public class UsuariosDAOImpl  extends BaseDAO implements UsuarioDao{

	@Override
	public Usuarios obtenerUsuarioPorUsername(String username) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuarios usr = null;
		try {
			String query = "Select * from nsbusr01 where usrlog = ? ";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, username);
			rs = stmt.executeQuery();
			if (rs.next()) {
				usr = new Usuarios(rs.getString("usrlog"), rs.getString("clave"), rs.getInt("estado")==1?true:false, Usuarios.uno());
				usr.setUsrapepat( rs.getString("usrapepat"));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return null;
	}

}
