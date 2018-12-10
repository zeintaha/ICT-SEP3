package sep.via.dk.sep3JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sep.via.dk.sep3JPA")
public class Sep3JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sep3JpaApplication.class, args);
	}
}
