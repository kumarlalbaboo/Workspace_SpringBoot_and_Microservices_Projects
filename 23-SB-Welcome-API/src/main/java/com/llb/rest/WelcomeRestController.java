package com.llb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/msg")
	public String getWelcomeMsg() {
		
		String port = env.getProperty("server.port");
		
		String msg = "Welcome to Ashok IT (" +port+ ")";
		return msg;
	}
}
