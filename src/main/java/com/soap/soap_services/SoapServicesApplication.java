package com.soap.soap_services;

import com.soap.soap_services.client.RealtimeClient;
import com.soap.soap_services.config.MyResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapServicesApplication {

	private static final Logger log = LoggerFactory.getLogger(SoapServicesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SoapServicesApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(RealtimeClient realtimeClient) {
		return args -> {
			MyResponse response = realtimeClient.submitRequest("CAI_42000120202201190847307573902240", "PON_DATA_COLLECTION");
			// Maneja la respuesta
			log.info(response.getMessage());
		};
	}
}
