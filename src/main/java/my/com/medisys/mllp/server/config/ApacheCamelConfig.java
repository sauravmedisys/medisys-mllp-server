package my.com.medisys.mllp.server.config;

import org.apache.camel.component.hl7.HL7DataFormat;
import org.apache.camel.component.hl7.HL7MLLPCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author    Shahed Hossain<shahed@medisys.com.sa>
 * @version   2.0.00
 * @since     2.0.00
 */
@Configuration
@ComponentScan(basePackages={ "my.com.medisys.mllp.server.route"})
@ImportResource({"classpath*:/META-INF/camel/applicationContext-camel.xml"})
public class ApacheCamelConfig {
	
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ApacheCamelConfig.class);
	
	@Bean
	public HL7MLLPCodec hl7codec() {
		HL7MLLPCodec hl7codec = new HL7MLLPCodec();
		hl7codec.setCharset("UTF-8");
		return hl7codec;
	}
	
	@Bean
	public HL7DataFormat hl7Format() {
		HL7DataFormat hl7Format = new HL7DataFormat();
		return hl7Format;
	}
	
}
