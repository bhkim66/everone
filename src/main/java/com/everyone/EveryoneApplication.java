package com.everyone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {BasePackage.class})
public class EveryoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(EveryoneApplication.class, args);
	}

}
