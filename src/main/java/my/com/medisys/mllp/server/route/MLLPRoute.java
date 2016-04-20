package my.com.medisys.mllp.server.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author    Saurav Wahid<saurav@medisys.com.sa>
 * @version   1.0.00
 * @since     1.0.00
 */
@Component
public class MLLPRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
//		from("{{hmis.mllp.uri}}").routeId("{{hmis.mllp.uri.id}}").process(new Processor() {
		from("mina2:tcp://localhost:8080?sync=true&codec=#hl7codec").process(new Processor() {
	        public void process(Exchange exchange) throws Exception {
	            String request = exchange.getIn().getBody(String.class);
	            log.info("Incoming Message Body:\n {}", request);
	        }
	    }).to("direct:actors").end().log("MLLP Route ");
	}

}
