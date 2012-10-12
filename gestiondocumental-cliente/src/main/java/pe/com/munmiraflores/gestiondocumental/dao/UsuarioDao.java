package pe.com.munmiraflores.gestiondocumental.dao;

import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;

public interface UsuarioDao {

	public Usuarios obtenerUsuarioPorUsername(String username);
	
}
