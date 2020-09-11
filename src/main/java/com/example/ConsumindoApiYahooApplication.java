package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.ConsumindoAPIService;

@SpringBootApplication
public class ConsumindoApiYahooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoApiYahooApplication.class, args);
		ConsumindoAPIService.consumindo();
	}

}
