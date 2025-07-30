package com.llb.restcontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.llb.props.AppProperties;

@RestController
@RequestMapping("/api")
public class MsgRestController {
	
	@Value("${api.messages.greet}")
	private String greetMsg;
	
//	@Value("${api.messages.welcome}")
//	private String welcomeMsg;
	
	@Autowired
	private AppProperties appProperties;
	
	@GetMapping(value = "/greet", produces = "text/plain")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name") String name) {
		
		String msg =name+", "+ greetMsg;
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	@GetMapping("/welcome/{name}")
	public ResponseEntity<String> getGreetMsg(@PathVariable("name") String name) {
		
		Map<String,String> messages = appProperties.getMessages();
		
		String welcomeMsg = messages.get("welcome");

		String msg = name+", "+welcomeMsg;
		
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
                                                  
}
