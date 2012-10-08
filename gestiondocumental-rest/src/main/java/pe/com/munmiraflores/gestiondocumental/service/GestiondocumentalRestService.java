package pe.com.munmiraflores.gestiondocumental.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.vo.GestiondocumentalCollection;

@Path("/usuarios-service")
@Produces("application/json")
@Consumes("text/plain,application/json")
public interface GestiondocumentalRestService {
	
	    @GET
	    @Path("/usuarios")
	    @Produces({"application/xml", "application/json"})
	    public GestiondocumentalCollection getUsuarios();

	    @GET
	    @Path("/{docanonum}/{doccor}/{tpodoccod}/seguimientos")
	    public String getSeguimientos(
	    		@PathParam("docanonum") Integer docanonum,
				@PathParam("doccor") Integer doccor,
				@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion;

	    public String getAnexos(
	    		@PathParam("docanonum") Integer docanonum,
				@PathParam("doccor") Integer doccor,
				@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion;
	    
	    public String getRecibo(
	    		@PathParam("docanonum") Integer docanonum,
				@PathParam("doccor") Integer doccor,
				@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion;
		
	    public String getDetalleRecibo(@PathParam("docanonum")  Integer docanonum  ) throws DAOExcepcion;
	    
	
	}