package ru.chuldum.postgresdockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PostgresDockerTestApplication {

	public static void main(String[] args) {

		SpringApplication.run(PostgresDockerTestApplication.class, args);

		// docker pull postgres:16.0-alpine3.18
	}

}
