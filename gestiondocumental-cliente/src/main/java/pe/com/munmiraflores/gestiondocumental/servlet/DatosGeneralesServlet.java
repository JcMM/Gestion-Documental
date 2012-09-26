package pe.com.munmiraflores.gestiondocumental.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.com.munmiraflores.gestiondocumental.domain.Documentos;
import pe.com.munmiraflores.gestiondocumental.service.GestiondocumentalService;

public class DatosGeneralesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private GestiondocumentalService gestiondocumentalService = null;
	
	public DatosGeneralesServlet() {
		ApplicationContext context = 
				 new ClassPathXmlApplicationContext("/applicationContext.xml");
		this.gestiondocumentalService = (GestiondocumentalService) context.getBean("gestiondocumentalServiceClient");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int anio = Integer.parseInt(request.getParameter("textndocumento1"));
		int nrodoc = Integer.parseInt(request.getParameter("textndocumento2"));
		String tipodoc = request.getParameter("select");
		Documentos d = new Documentos();
		try {
			d = gestiondocumentalService.getDatosGenerales(anio, nrodoc, tipodoc);//(2012, 100, "EXPE");
			String tiponumeroanio = d.getTpodoccod()+"-"+d.getDoccor()+"-"+d.getDocanonum();
			String fecingreso = d.getDocfchcre();
			String estado = d.getEstados().getStsdsc();
			String solicitante = d.getDocsolncmp();
			String dni = d.getPersonas().getDni();
			String rucm = d.getPersonas().getRuc();
			String asunto = d.getDocasu();
			String folio = d.getDocnumfol().toString();
			String docuoactco = d.getDocuoactco().toString();
			String uoactual = d.getUnidadOrganica().getUniorgnom();
			String doccaractc = d.getDoccaractc().toString();
			String cargoactual = d.getCargo().getCardsc();
			String direfiscal = d.getDocdirfisc();
			String dircorrespondencia = d.getDocdircorc();
			String dirinmueble = d.getDvigucdir();
			String observaciones = d.getDocobs();
			String hojadecargo = d.getDocflghc().toString();
			String anexado = d.getDocflganx().toString();
			String archivado = d.getDocflgarc().toString();
			String docusrcre = d.getDocusrcre().toString();
			String usuariocreacion = d.getUsuariosa().getUsrlog();
			String feccreacion = d.getDocfchcre();
			String docusrmod = d.getDocusrmod().toString();
			String usuariomodifica = d.getUsuariosb().getUsrlog();
			String fecmod = d.getDocfchmod();
			request.setAttribute("tiponumeroanio", tiponumeroanio);
			request.setAttribute("fecingreso", fecingreso);
			request.setAttribute("estado", estado);
			request.setAttribute("solicitante", solicitante);
			request.setAttribute("dni", dni);
			request.setAttribute("rucm", rucm);
			request.setAttribute("asunto", asunto);
			request.setAttribute("folio", folio);
			request.setAttribute("docuoactco", docuoactco);
			request.setAttribute("uoactual", uoactual);
			request.setAttribute("doccaractc", doccaractc);
			request.setAttribute("cargoactual", cargoactual);
			request.setAttribute("direfiscal", direfiscal);
			request.setAttribute("dircorrespondencia", dircorrespondencia);
			request.setAttribute("dirinmueble", dirinmueble);
			request.setAttribute("observaciones", observaciones);
			request.setAttribute("hojadecargo", hojadecargo);
			request.setAttribute("anexado", anexado);
			request.setAttribute("archivado", archivado);
			request.setAttribute("docusrcre", docusrcre);
			request.setAttribute("usuariocreacion", usuariocreacion);
			request.setAttribute("feccreacion", feccreacion);
			request.setAttribute("docusrmod", docusrmod);
			request.setAttribute("usuariomodifica", usuariomodifica);
			request.setAttribute("fecmod", fecmod);
			RequestDispatcher rd = request.getRequestDispatcher("principal.jsp");
			rd.forward(request, response);
		 } catch (Exception e) {
			 e.printStackTrace();
			 request.setAttribute("MENSAJE", "No se encontraron datos.");
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			 rd.forward(request, response);
		} 
	}
}
