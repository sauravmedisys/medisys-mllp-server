package my.com.medisys.mllp.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author    Saurav Wahid<saurav@medisys.com.sa>
 * @version   1.0.00
 * @since     1.0.00
 */

@SpringBootApplication
@ComponentScan(basePackages= "my.com.medisys.mllp.server")
public class BootApplication{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootApplication.class, args);
	}
	
}
