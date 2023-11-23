package com.application.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@AutoConfiguration
@EnableWebFlux
@SpringBootApplication
@EnableJpaRepositories
public final class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);
	}

}
