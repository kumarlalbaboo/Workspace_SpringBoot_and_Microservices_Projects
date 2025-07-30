package com.llb.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductRestController {
	
	@GetMapping("/product")
	public ResponseEntity<String> getWelcomeMsg(){
		
		String msg = "IPhone cost is 68,0000";
		
		int i = 10/0;
		
		return new ResponseEntity<>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
