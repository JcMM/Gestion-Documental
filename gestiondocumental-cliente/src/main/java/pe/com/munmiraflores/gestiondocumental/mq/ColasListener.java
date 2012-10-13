package pe.com.munmiraflores.gestiondocumental.mq;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.log4j.Logger;

public class ColasListener implements MessageListener{

private Logger logger = Logger.getLogger(ColasListener.class);
	
	@Override
	public void onMessage(Message msg) {
		logger.debug("mensaje recibido " + msg );
		System.out.println("mensaje recibido " + msg );
		try {
			if (msg instanceof TextMessage) {
				TextMessage tmsg  = (TextMessage)msg;
				logger.debug("mensaje de texto  recibido " + tmsg.getText() );
				System.out.println("mensaje de texto  recibido " + tmsg.getText() );
				
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
