package com.apirest.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
		System.out.println("Olá, Mundo!");
		System.out.println("Sucesso com o Spring WebFlux!");
	}
}
