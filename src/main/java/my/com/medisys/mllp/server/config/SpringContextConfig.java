package my.com.medisys.mllp.server.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * @author    Shahed Hossain<shahed@medisys.com.sa>
 * @version   2.0.00
 * @since     2.0.00
 */
@Profile({"dev", "uat", "pro"})
@Configuration
@ImportResource({"classpath*:/META-INF/spring/applicationContext.xml"})
public class SpringContextConfig {
	
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(SpringContextConfig.class);
	
}
