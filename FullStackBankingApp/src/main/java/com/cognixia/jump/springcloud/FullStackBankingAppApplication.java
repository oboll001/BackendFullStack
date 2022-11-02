package com.cognixia.jump.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cognixia.jump.controller.AccountController;

@SpringBootApplication
@ComponentScan(basePackageClasses = AccountController.class)
public class FullStackBankingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackBankingAppApplication.class, args);
	}

}
