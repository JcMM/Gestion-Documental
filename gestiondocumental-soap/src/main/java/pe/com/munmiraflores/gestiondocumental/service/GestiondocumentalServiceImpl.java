package pe.com.munmiraflores.gestiondocumental.service;

import java.util.Collection;
import java.util.List;

import javax.jws.WebService;

import pe.com.munmiraflores.gestiondocumental.dao.DatosGeneralesDAO;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;


@SuppressWarnings("restriction")
@WebService(endpointInterface="pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService")
public class GestiondocumentalServiceImpl implements GestiondocumentalService {

	DatosGeneralesDAO datosGeneralesDAO;
	
	public void setDatosGeneralesDAO(DatosGeneralesDAO datosGeneralesDAO) {
		this.datosGeneralesDAO = datosGeneralesDAO;
	}
	
	public Documentos getDatosGenerales(Integer docanonum, Integer doccor, String tpodoccod) throws Exception {
		return datosGeneralesDAO.getDatosGenerales(docanonum, doccor, tpodoccod);
	}

}

