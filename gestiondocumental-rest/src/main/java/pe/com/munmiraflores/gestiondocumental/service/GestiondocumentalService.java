package pe.com.munmiraflores.gestiondocumental.service;

import java.io.IOException;
import java.util.Collection;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;
import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.vo.GestiondocumentalCollection;

@Path("/usuarios-service/")
@Produces("application/xml")
public interface GestiondocumentalService {
	
	    /*@GET
	    @Path("/usuarios")
	    @Produces({"application/xml", "application/json"})
	    public GestiondocumentalCollection getUsuarios();*/

	    @GET
	    @Path("/usuarios/{docanonum,doccor,tpodoccod}")
	    public Collection<Seguimiento> getSeguimientos(//@PathParam("dni") String dni
	    		@PathParam("docanonum") Integer docanonum,
				@PathParam("doccor") Integer doccor,
				@PathParam("tpodoccod") String tpodoccod) throws DAOExcepcion;

	    /*@GET
	    @Path("/usuarios/bad")
	    public Response getBadRequest();*/
	    
	    /*@POST
	    @Path("/new")
		@Produces(MediaType.TEXT_HTML)
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		public void newUsuarios(
				@FormParam("usrcod") Integer  usrcod,
				@FormParam("usrapepat") String usrapepat,
				@FormParam("usrapemat") String usrapemat,
				@FormParam("usrnom") String usrnom,
				@FormParam("usrlog") String usrlog,
				@FormParam("usrclv") String usrclv,
				@FormParam("usrenc") String usrenc,
				@FormParam("usrstsreg") Integer usrstsreg,
				@FormParam("usrufclv") String usrufclv,
				@FormParam("usrfchmod") String usrfchmod,
				@FormParam("usrmod") Integer usrmod,
				@FormParam("usrhramod") String usrhramod,
				@FormParam("usrmai") String usrmai,
				@FormParam("usrfchcrc") String usrfchcrc,
				@FormParam("usrcrc") Integer usrcrc,
				@FormParam("usrhracrc") String usrhracrc,
				@FormParam("usrfchlog") String usrfchlog,
				@FormParam("trbcod") Integer trbcod,
				@FormParam("usrwkscre") String usrwkscre,
				@FormParam("usrwksmod") String usrwksmod,
				@FormParam("usrclv3") String usrclv3,
				@FormParam("usrclv2") String usrclv2,
				@FormParam("usrvcrono") Integer usrvcrono,
				@Context HttpServletResponse servletResponse
		) throws IOException;
	    */

	}