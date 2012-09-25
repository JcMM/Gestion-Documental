package pe.com.munmiraflores.gestiondocumental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import pe.com.munmiraflores.gestiondocumental.domain.Cargo;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;
import pe.com.munmiraflores.gestiondocumental.domain.Estados;
import pe.com.munmiraflores.gestiondocumental.domain.Personas;
import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;
import pe.com.munmiraflores.gestiondocumental.domain.Tareas;
import pe.com.munmiraflores.gestiondocumental.domain.UnidadOrganica;
import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.util.ConexionBD;


public interface DatosGeneralesDAO {
	
	public Documentos getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion;

}
 