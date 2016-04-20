package my.com.medisys.mllp.server.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author    Saurav Wahid<saurav@medisys.com.sa>
 * @version   1.0.00
 * @since     1.0.00
 */
@Component
public class ActorsRoute extends RouteBuilder {
	
	@Override
	public void configure() throws Exception {
				
		 from("direct:actors").routeId("actors").bean("ResponseEpoint")
		 .end();
		
	}

}
