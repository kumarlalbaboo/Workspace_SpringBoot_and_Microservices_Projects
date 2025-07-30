package com.llb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.llb.binding.Quote;
import com.llb.controller.ApiConsumerController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
//		m1();
//		System.out.println("========================================");
//		m2();
		
		RestTemplate rt = new RestTemplate();
		
		String apiUrl = "https://dummyjson.com/quotes";
		
		ResponseEntity<ApiConsumerController> forEntity = rt.getForEntity(apiUrl, ApiConsumerController.class);
		
		ApiConsumerController body = forEntity.getBody();
		System.out.println(body.getQuotes());
	}
	
	/*public static void m2() {
		
		RestTemplate rt = new RestTemplate();
		
		String apiUrl = "https://dummyjson.com/quotes/random";
		
		ResponseEntity<Quote> forEntity = rt.getForEntity(apiUrl, Quote.class);
		
		int value = forEntity.getStatusCode().value();
		
		Quote body = forEntity.getBody();
		
		System.out.println(body);
		
	}
	
	public static void m1() {
		RestTemplate rt = new RestTemplate();
		
		String apiUrl = "https://dummyjson.com/quotes/random";
		
		ResponseEntity<String> forEntity = rt.getForEntity(apiUrl, String.class);
		
		int value = forEntity.getStatusCode().value();
		
		if(value == 200) {
			String body = forEntity.getBody();
			System.out.println(body);
		}
	}*/

}
