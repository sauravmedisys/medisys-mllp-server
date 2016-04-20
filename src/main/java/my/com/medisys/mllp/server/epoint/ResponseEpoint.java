package my.com.medisys.mllp.server.epoint;

import org.apache.camel.Exchange;

public interface ResponseEpoint{

	public void exchange(Exchange exchange , Exception e);
}
