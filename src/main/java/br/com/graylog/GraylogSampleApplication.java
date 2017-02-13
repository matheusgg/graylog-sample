package br.com.graylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class GraylogSampleApplication {

	public static void main(final String[] args) {
		SpringApplication.run(GraylogSampleApplication.class, args);
	}

	@GetMapping("/hi")
	public String hi(final String userName, final boolean raiseEx) {
		log.info("username={}", userName);
		if (raiseEx) {
			log.error("Some Exception", new RuntimeException("RuntimeException"));
		}
		return "Hi " + userName;
	}

}
