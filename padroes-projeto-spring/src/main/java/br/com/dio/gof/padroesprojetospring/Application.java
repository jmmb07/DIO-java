package br.com.dio.gof.padroesprojetospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Initialirz
 * -Spring Data JPA
 * -Spring Web
 * -H2 Database
 * -OpenFeigh
 *
 * @author JoaoBorgato
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
