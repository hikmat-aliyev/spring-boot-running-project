package dev.hikmat.runnerz;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.hikmat.runnerz.run.Location;
import dev.hikmat.runnerz.run.Run;
import dev.hikmat.runnerz.run.RunRepository;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// @Bean
	// CommandLineRunner runner(RunRepository runRepository) {
	// return args -> {
	// Run run = new Run(1, "Morning Jog", LocalDateTime.now(), LocalDateTime.now(),
	// 3, Location.OUTDOOR);
	// runRepository.create(run);
	// };
	// }
}
