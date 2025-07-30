package com.llb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.sym.Name;

@Controller
public class MsgController {

	// URL: http://localhost:8080/greet?name=raj
	@GetMapping("/greet")
	@ResponseBody
	public String greetMsg(@RequestParam("name") String name) {
		
		String msg = name+", Good morning..!!";
		
		return msg;
	}
	
	// URL: http://localhost:8080/course?c=Java&t=ashok
	@GetMapping("/course")
	@ResponseBody
	public String greetMsg(@RequestParam("c") String course, @RequestParam("t") String trainer) {
		
		String msg = course+" By " +trainer+" will start soon...";
		
		return msg;
	}
	
	// URL: http://localhost:8080/welcome/Lalbaboo
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String getWelcome(@PathVariable("name") String name) {
		String msg = name+" welcome to Ashok IT";
		return msg;
	}
	
}
