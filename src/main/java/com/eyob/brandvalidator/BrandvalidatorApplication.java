package com.eyob.brandvalidator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class BrandvalidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrandvalidatorApplication.class, args);
	}

}
