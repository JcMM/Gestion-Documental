package pe.com.munmiraflores.gestiondocumental.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import pe.com.munmiraflores.gestiondocumental.dao.SeguimientoDAO;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalRestService;
import pe.com.munmiraflores.gestiondocumental.vo.GestiondocumentalCollection;

import com.google.gson.Gson;


@Path("/usuarios-service")
@Produces("application/json")
@Consumes("text/plain,application/json")
public class GestiondocumentalServiceImpl implements GestiondocumentalRestService {
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	SeguimientoDAO vo = new SeguimientoDAO();

    public GestiondocumentalServiceImpl() {}
    
    @Override
    @GET
    @Path("/{docanonum}/{doccor}/{tpodoccod}/seguimientos")
    public String getSeguimientos(
    		@PathParam("docanonum") Integer docanonum,
			@PathParam("doccor") Integer doccor,
			@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion{
    	Gson gson = new Gson();
        return gson.toJson( vo.listarSeguimiento(docanonum, doccor, tpodoccod) );
    }
    
    @Override
    @GET
    @Path("/usuarios")
    @Produces({"application/xml", "application/json"})
    public GestiondocumentalCollection getUsuarios() {
    	return new GestiondocumentalCollection(   );
    }
    
    
    
    @Override
    @GET
    @Path("/{docanonum}/{doccor}/{tpodoccod}/anexos")
    public String getAnexos(
    		@PathParam("docanonum") Integer docanonum,
			@PathParam("doccor") Integer doccor,
			@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion{
    	Gson gson = new Gson();
        return gson.toJson( vo.getAnexos(docanonum, doccor, tpodoccod) );
    }
    
    @Override
    @GET
    @Path("/{docanonum}/{doccor}/{tpodoccod}/recibo")
    public String getRecibo(
    		@PathParam("docanonum") Integer docanonum,
			@PathParam("doccor") Integer doccor,
			@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion{
    	Gson gson = new Gson();
        return gson.toJson( vo.getRecibo(docanonum, doccor, tpodoccod) );
    }
  
	@Override
	@GET
    @Path("/{docanonum}/{doccor}/{tpodoccod}/recibo/{idrec}/detalle")
	public String getDetalleRecibo(@PathParam("idrec") Integer docanonum) throws DAOExcepcion {
		Gson gson = new Gson();
        return gson.toJson( vo.getDetalleRecibo(docanonum ) );
	}

}
