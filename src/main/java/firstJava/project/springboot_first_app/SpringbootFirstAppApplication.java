package firstJava.project.springboot_first_app;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		// Set system properties from .env
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
	}

}
