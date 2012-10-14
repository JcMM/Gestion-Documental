package pe.com.munmiraflores.gestiondocumental.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("session")
public class AdminController {

	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	@RequestMapping(value ="/admin/usuarios.htm" )
	public String general( ModelMap model , HttpServletRequest request, HttpServletResponse response ){
		logger.debug("por mostrar la lista de usuarios");
		
		model.put("cola", request.getSession().getAttribute("lusuariocola") );
		
		return "admin/usuarios";
	}
	
}
