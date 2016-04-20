package my.com.medisys.mllp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author    Saurav Wahid<saurav@medisys.com.sa>
 * @version   1.0.00
 * @since     1.0.00
 */
@Configuration
@ComponentScan(basePackages= {"my.com.medisys.mllp.config"})
public class MLLPConfig {
	
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(MLLPConfig.class);

}
