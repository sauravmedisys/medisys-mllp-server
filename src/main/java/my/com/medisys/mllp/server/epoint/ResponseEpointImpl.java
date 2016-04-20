/**
 * 
 */
package my.com.medisys.mllp.server.epoint;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.PipeParser;
import my.com.medisys.mllp.server.route.MLLPRoute;

/**
 * @author    Saurav Wahid<saurav@medisys.com.sa>
 * @version   1.0.00
 * @since     1.0.00
 */
@Component("ResponseEpoint")
public class ResponseEpointImpl implements ResponseEpoint{
	
	private static final Logger log = LoggerFactory.getLogger(MLLPRoute.class);

	@Override
	public void exchange(Exchange exchange, Exception e) {
		String request = exchange.getIn().getBody(String.class);
		PipeParser parser = new PipeParser();
        Message messege;
		try {
			messege = parser.parse(request);
			log.info("Request Messege \n {]", request);
			
			String response = messege.generateACK().encode();
			exchange.getOut().setBody(response);
			log.info("Reponse Messege \n {]", response);
		
		} catch (Exception e1) {
			log.error(e.getMessage(), e);
		}
        
	}

}
