package dev.hikmat.runnerz;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.hikmat.runnerz.run.Location;
import dev.hikmat.runnerz.run.Run;
import dev.hikmat.runnerz.user.User;
import dev.hikmat.runnerz.user.UserRestClient;
import dev.hikmat.runnerz.run.JdbcClientRunRepository;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRestClient userRestClient) {
		return args -> {

			System.out.println(userRestClient.findById(1));
		};
	}
}
