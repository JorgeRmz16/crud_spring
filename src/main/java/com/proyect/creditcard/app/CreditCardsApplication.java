package com.proyect.creditcard.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.proyect.creditcard.app.entity")
@ComponentScan("com.proyect.creditcard.app")
public class CreditCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardsApplication.class, args);
	}

}
