package mou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer {

	@Autowired
	public static Environment environment;
	
	public static void main(String[] args) {
		System.setProperty("user.timezone", "Asia/Hong_Kong");
		SpringApplication.run(Application.class, args);
	}
}
