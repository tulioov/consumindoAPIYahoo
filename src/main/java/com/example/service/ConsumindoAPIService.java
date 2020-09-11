package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ConsumindoAPIService {
	
	public static void consumindo() {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://query1.finance.yahoo.com/v7/finance/quote?symbols=TLS.AX,MUS.AX"; 
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		System.out.println(response);
	}
	
	
}
