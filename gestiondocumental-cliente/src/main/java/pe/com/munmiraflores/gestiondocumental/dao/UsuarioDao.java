package pe.com.munmiraflores.gestiondocumental.dao;

import pe.com.munmiraflores.gestiondocumental.domain.UsuariosSystem;

public interface UsuarioDao {

	public UsuariosSystem obtenerUsuarioPorUsername(String username);
	
}
