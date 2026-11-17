package com.dsin.EdgeCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EdgeCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeCartApplication.class, args);
	}

}
