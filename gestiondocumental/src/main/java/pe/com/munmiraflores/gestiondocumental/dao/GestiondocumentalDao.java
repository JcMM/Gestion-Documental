package pe.com.munmiraflores.gestiondocumental.dao;

import java.util.List;

import pe.com.munmiraflores.gestiondocumental.domain.Documentos;


public interface GestiondocumentalDao {
	
	public List<Documentos> getDatosGenerales(Integer docanonum, Integer doccor,String tpodoccod) throws Exception;

}
 