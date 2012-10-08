package pe.com.munmiraflores.gestiondocumental.rest.controller;

import java.lang.reflect.Type;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import pe.com.munmiraflores.gestiondocumental.domain.Anexo;
import pe.com.munmiraflores.gestiondocumental.domain.DetRecibo;
import pe.com.munmiraflores.gestiondocumental.domain.Documentos;
import pe.com.munmiraflores.gestiondocumental.domain.Recibos;
import pe.com.munmiraflores.gestiondocumental.domain.Seguimiento;
import pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService;

import com.google.gson.Gson;

@Controller
public class GestionController {
	
	@Autowired
	private GestiondocumentalService gestiondocumentalService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value ="/datosGenerales.htm" )
	public String buscaDocumento( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		
		int anio = Integer.parseInt(request.getParameter("textndocumento1"));
		int nrodoc = Integer.parseInt(request.getParameter("textndocumento2"));
		String tipodoc = request.getParameter("select");
		Documentos d = new Documentos();
		try {
			//(2012, 100, "EXPE");
			System.out.println(" anio " + anio + "nrodoc " + nrodoc + "tdoc " + tipodoc);
			d = gestiondocumentalService.getDatosGenerales(anio, nrodoc, tipodoc);
			
			if( d != null){
				request.getSession().setAttribute("s_expediente", d );			
			}
			
			model.put("expediente", d);
			
		} catch (Exception e) {
			 e.printStackTrace();
			 request.setAttribute("MENSAJE", "No se encontraron datos.");
		}
		System.out.println(" TODO BIEN RETURN AHORA");
		return "principal";
	}	
	
	@RequestMapping(value ="/general.htm" )
	public String general( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		Documentos d = (Documentos) request.getSession().getAttribute("s_expediente");
		model.put("expediente", d);
		
		return "principal";
	}
	
	@RequestMapping(value ="/seguimiento.htm" )
	public String seguimiento( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		Documentos d = (Documentos) request.getSession().getAttribute("s_expediente");
		try {
			String url = "http://localhost:8080/gestiondocumental-rest/rs/rest/usuarios-service/{anio}/{corr}/{tipo}/seguimientos";
			String respuesta = restTemplate.getForObject(url , String.class, d.getDocanonum() ,d.getDoccor() , d.getTpodoccod());
			
			Gson gson = new Gson();
			Type collectionType= new com.google.gson.reflect.TypeToken<List<Seguimiento>>(){}.getType();
	        List<Seguimiento> listaPedidos= gson.fromJson(respuesta	, collectionType);
	        request.setAttribute("lista", listaPedidos);
	        model.put("expediente", d);
			
	                    
		} catch (Exception e) {
			 e.printStackTrace();
			 request.setAttribute("MENSAJE", "No se encontraron datos.");
		}
		return "seguimiento";
	}
	
	
	
	@RequestMapping(value ="/anexos.htm" )
	public String anexos( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		Documentos d = (Documentos) request.getSession().getAttribute("s_expediente");
		try {
			
			String url = "http://localhost:8080/gestiondocumental-rest/rs/rest/usuarios-service/{anio}/{corr}/{tipo}/anexos";
			String respuesta = restTemplate.getForObject(url , String.class, d.getDocanonum() ,d.getDoccor() , d.getTpodoccod());
			
			Gson gson = new Gson();
			Type collectionType= new com.google.gson.reflect.TypeToken<List<Anexo>>(){}.getType();
	        List<Anexo> listaPedidos= gson.fromJson(respuesta , collectionType);
	        request.setAttribute("lista", listaPedidos);
	        model.put("expediente", d);
	                    
		} catch (Exception e) {
			 e.printStackTrace();
			 request.setAttribute("MENSAJE", "No se encontraron datos.");
		}
		return "anexos";
	}
	

	@RequestMapping(value ="/recibo.htm" )
	public String recibos( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		Documentos d = (Documentos) request.getSession().getAttribute("s_expediente");
		try {
			String url = "http://localhost:8080/gestiondocumental-rest/rs/rest/usuarios-service/{anio}/{corr}/{tipo}/recibo";
			String respuesta = restTemplate.getForObject(url , String.class, d.getDocanonum() ,d.getDoccor() , d.getTpodoccod());
			
			Gson gson = new Gson();
	        Recibos recibo= gson.fromJson(respuesta,Recibos.class);
	        request.setAttribute("recibo", recibo);
	        model.put("expediente", d);
	                    
	        
	        // RECOGIENDO AHROA EL DETALLE
	        
	        		url = "http://localhost:8080/gestiondocumental-rest/rs/rest/usuarios-service/{anio}/{corr}/{tipo}/recibo/{recfact}/detalle";
			respuesta = restTemplate.getForObject(url , String.class, d.getDocanonum() ,d.getDoccor() , d.getTpodoccod(),recibo.getDocrecfact());
			
			gson = new Gson();
			Type collectionType= new com.google.gson.reflect.TypeToken<List<DetRecibo>>(){}.getType();
	        List<DetRecibo> listaPedidos= gson.fromJson(respuesta , collectionType);
	        System.out.println("detalle " + listaPedidos.size() );
	        request.setAttribute("lista", listaPedidos);
	        
	        
		} catch (Exception e) {
			 e.printStackTrace();
			 request.setAttribute("MENSAJE", "No se encontraron datos.");
		}
		return "recibo";
	}
	
}

