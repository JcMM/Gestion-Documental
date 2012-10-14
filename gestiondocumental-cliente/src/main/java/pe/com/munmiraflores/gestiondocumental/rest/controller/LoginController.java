package pe.com.munmiraflores.gestiondocumental.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.munmiraflores.gestiondocumental.domain.UsuariosSystem;

@Controller
@Scope("session")
public class LoginController {

	private static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@RequestMapping(value="/login.htm")
	public String login(HttpServletRequest request, HttpServletResponse response){
		logger.debug("login" );
		return "login";
	}
	
	@RequestMapping(value="/home.htm")
	public String inicio(HttpServletRequest request, HttpServletResponse response){
		logger.debug("home" );
		
		//aqui envio un mensaje a la cola para que sepan que he iniciado session
		jmsTemplate.convertAndSend("cola_docs", " Login : " + UsuariosSystem.getUsuarioBean().getUsername() );
		return "index";
	}
}
