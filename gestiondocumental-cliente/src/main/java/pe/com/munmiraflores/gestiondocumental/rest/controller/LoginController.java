package pe.com.munmiraflores.gestiondocumental.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("session")
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/login.htm")
	public String login(HttpServletRequest request, HttpServletResponse response){
		logger.debug("login" );
		return "login";
	}
	
	@RequestMapping(value="/home.htm")
	public String inicio(HttpServletRequest request, HttpServletResponse response){
		logger.debug("home" );
		return "index";
	}
}
