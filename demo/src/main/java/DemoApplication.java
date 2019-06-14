import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableJpaRepositories("com.kf.demo")
@EntityScan(value = "com.kf.demo.model")

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
	//https://rpouiller.developpez.com/tutoriels/spring/application-web-spring-hibernate/
	//https://www.mkyong.com/spring-boot/spring-boot-hello-world-example-thymeleaf/
	//https://o7planning.org/fr/11681/tutoriel-spring-boot-et-jsp
	//thymeleaf
	//jsp
	//https://stackoverflow.com/questions/41521302/spring-boot-bean-null-exception

}
