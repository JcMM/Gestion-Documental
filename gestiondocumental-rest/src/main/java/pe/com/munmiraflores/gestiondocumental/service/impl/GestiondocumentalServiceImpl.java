package pe.com.munmiraflores.gestiondocumental.service.impl;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import pe.com.munmiraflores.gestiondocumental.dao.SeguimientoDAO;
import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;
import pe.com.munmiraflores.gestiondocumental.domain.Usuarios;
import pe.com.munmiraflores.gestiondocumental.exception.DAOExcepcion;
import pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService;
import pe.com.munmiraflores.gestiondocumental.vo.GestiondocumentalCollection;


public class GestiondocumentalServiceImpl implements GestiondocumentalService {
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	SeguimientoDAO vo = new SeguimientoDAO();

	//private static List<Seguimiento> seguimientos = new ArrayList<Seguimiento>();
    /*private static Map<String, Usuarios> usuarios = new HashMap<String, Usuarios>();

    static {
    	usuarios.put("25723525", new Usuarios(1036,"TUESTA","RUIZ","HILDA","HTUESTA","Q5CJS65wWoapN2jOhLlEcw==","0277405C614E5E3CC5CC1F890EA90653",1,"2010-09-07 00:00:00","2010-07-08 00:00:00",65,"11:12:36","","2010-07-08 00:00:00",65,"11:05:48","2039-12-31 00:00:00",1343,"","","Vb3l2YDvF0nrBH9Jnaee9Q==","Zabk6n04mMhXcNaOvm1Ljg==",null));//("1036", "Jose Amadeo Martin", "Diaz", "Diaz", "06-11-1974", "140501", "M", "C"));
    	usuarios.put("41191089", new Usuarios(1035,"URBANO", "HUAMANI", "RONALD ALFONSO", "RURBANO", "9m0/spHkgcXvw8qW6x8H2Q==", "366A8DBE2CE25BF66FBAAC24034C38AF",0, "2010-10-12 00:00:00","2010-11-02 00:00:00",65,"12:43:18","","2010-07-07 00:00:00",65,"09:46:46","09:46:46",1342,"","","t7+89NqEVYlnPCkBGsaYxg==","dA+Pb8rNpmOaAqZ6yHst/w==",null));
    }*/
    
    public GestiondocumentalServiceImpl() {}
    
    @Override
    public Collection<Seguimiento> getSeguimientos(Integer docanonum, Integer doccor, String tpodoccod) throws DAOExcepcion {
        return vo.listarSeguimiento(docanonum, doccor, tpodoccod);
    }
    
    /*@Override
    public GestiondocumentalCollection getUsuarios() {
        return new GestiondocumentalCollection(usuarios.values());
    }
    
    @Override
    public Usuarios getUsuarios(String dni) {
        return usuarios.get(dni);
    }
    
    @Override
    public Response getBadRequest() {
        return Response.status(Status.BAD_REQUEST).build();
    }
    
    @Override
	public void newUsuarios(Integer usrcod, String usrapepat, String usrapemat,
			String usrnom, String usrlog, String usrclv, String usrenc,
			Integer usrstsreg, String usrufclv, String usrfchmod,
			Integer usrmod, String usrhramod, String usrmai, String usrfchcrc,
			Integer usrcrc, String usrhracrc, String usrfchlog, Integer trbcod,
			String usrwkscre, String usrwksmod, String usrclv3, String usrclv2,
			Integer usrvcrono, HttpServletResponse servletResponse)
			throws IOException {
		Usuarios usuario = new Usuarios(usrcod, usrapepat, usrapemat, usrnom, usrlog, usrclv, usrenc, usrstsreg, usrufclv, usrfchmod, usrmod, usrhramod, usrmai, usrfchcrc, usrcrc, usrhracrc, usrfchlog, trbcod, usrwkscre, usrwksmod, usrclv3, usrclv2, usrvcrono);
		usuarios.put(usrcod.toString(), usuario);
		URI uri = uriInfo.getAbsolutePathBuilder().path(usrcod.toString()).build();
		Response.created(uri).build();
		servletResponse.sendRedirect("../../postUsuarios.jsp");
		
	}*/

}
