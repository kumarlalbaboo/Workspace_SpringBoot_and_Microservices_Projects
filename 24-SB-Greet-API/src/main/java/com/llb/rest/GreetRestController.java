package com.llb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llb.feign.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient welcomeApiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeApiResponse = welcomeApiClient.invokeWelcomeApi();
		
		String greetApiResponse = "Good Morning";
		return greetApiResponse+ ", "+welcomeApiResponse;
		
	}
}
