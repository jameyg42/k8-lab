package jameyg.k8.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringConfigDemo {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigDemo.class, args);
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return "hello world";
	}
}
