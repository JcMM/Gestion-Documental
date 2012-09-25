package pe.com.munmiraflores.gestiondocumental.service;

import java.util.List;

import javax.jws.WebService;

import pe.com.munmiraflores.gestiondocumental.dao.GestiondocumentalDao;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;


@SuppressWarnings("restriction")
@WebService(endpointInterface="pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService")
public class GestiondocumentalServiceImpl implements GestiondocumentalService {

	GestiondocumentalDao gestiondocumentalDao;
	
	public void setGestiondocumentalDao(GestiondocumentalDao gestiondocumentalDao) {
		this.gestiondocumentalDao = gestiondocumentalDao;
	}
	
	public List<Documentos> getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) throws Exception {
		return gestiondocumentalDao.getDatosGenerales(docanonum, doccor, tpodoccod);
	}

}

