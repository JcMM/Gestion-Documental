package pe.com.munmiraflores.gestiondocumental.service;

import java.util.Collection;

import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;

public interface GestiondocumentalRestService {
	
	    public GestiondocumentalCollection getUsuarios();

	    public Collection<Seguimiento> getSeguimientos(
	    		Integer docanonum,
				Integer doccor,
				String tpodoccod) ;


	}