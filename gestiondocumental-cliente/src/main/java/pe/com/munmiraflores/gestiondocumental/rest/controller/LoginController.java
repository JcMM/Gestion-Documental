package pe.com.munmiraflores.gestiondocumental.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("session")
public class LoginController {

	@RequestMapping("/login.htm")
	public String login(HttpServletRequest request, HttpServletResponse response){
		return "login";
	}
	
	@RequestMapping("/home.htm")
	public String inicio(HttpServletRequest request, HttpServletResponse response){
		return "index";
	}
}
