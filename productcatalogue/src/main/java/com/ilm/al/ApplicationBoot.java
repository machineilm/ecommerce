package com.ilm.al;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBoot {

	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationBoot.class);
	
	public static void main(String[] args) {
		LOGGER.debug("ProductCatalogue Application starting....");
		SpringApplication.run(ApplicationBoot.class, args);
	}
	
}
