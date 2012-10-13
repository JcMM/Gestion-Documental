package pe.com.munmiraflores.gestiondocumental.mq;

import java.util.ArrayList;
import java.util.List;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class ColasListener implements MessageListener{

private Logger logger = Logger.getLogger(ColasListener.class);
	
	
	@Override
	public void onMessage(Message msg) {
		logger.debug("mensaje recibido " + msg );
		System.out.println("mensaje recibido " + msg );
		try {
			if (msg instanceof TextMessage) {
				TextMessage tmsg  = (TextMessage)msg;
				logger.debug(" =====>>> " + tmsg.getText() );
				///System.out.println("mensaje de texto  recibido " + tmsg.getText() );
				
			/*	ServletRequestAttributes t = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();  
				HttpServletRequest request = t.getRequest();  
				
				if(request.getSession().getAttribute("lusuariocola") != null ){
					request.getSession().setAttribute("lusuariocola", new ArrayList<String>());	
				}
				List<String> lista = (List<String>)request.getSession().getAttribute("lusuariocola");
				
				lista.add(tmsg.getText() );
				*/
				
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
