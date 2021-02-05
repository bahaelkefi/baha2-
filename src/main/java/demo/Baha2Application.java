package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages={"demo","controller","modele","repositories","service"})
@Configuration
@EnableJpaRepositories("repositories")
@ComponentScan({"demo","controller","modele","repositories","service"})
@EntityScan(basePackages = {"modele"})

public class Baha2Application {

	public static void main(String[] args) {
		SpringApplication.run(Baha2Application.class, args);
	}
	

	


}
