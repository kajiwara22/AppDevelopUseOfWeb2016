package jp.ac.tama;

import jp.ac.tama.model.InputResult;
import jp.ac.tama.service.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication  implements CommandLineRunner {
	@Autowired
	private InputService inputService;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Please input two number.");
		InputResult inputResult = inputService.ScanInput(System.in);
		System.out.println(inputResult.toString());



	}
}
