package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com .edubridge.controller")
public class NooksReadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NooksReadingApplication.class, args);
	}

}
