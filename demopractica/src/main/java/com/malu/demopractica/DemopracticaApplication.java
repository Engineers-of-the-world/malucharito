package com.malu.demopractica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.malu.repository")
@ComponentScan({"com.malu.controller","com.malu.service"})
@EntityScan("com.malu.modell")
public class DemopracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemopracticaApplication.class, args);
	}
}
