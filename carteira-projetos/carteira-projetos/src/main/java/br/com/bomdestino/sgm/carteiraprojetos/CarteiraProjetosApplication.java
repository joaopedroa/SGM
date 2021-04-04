package br.com.bomdestino.sgm.carteiraprojetos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CarteiraProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteiraProjetosApplication.class, args);
	}

}
