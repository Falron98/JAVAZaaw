package pl.pjatk.barkry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class BarkryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarkryApplication.class, args);
	}

}
