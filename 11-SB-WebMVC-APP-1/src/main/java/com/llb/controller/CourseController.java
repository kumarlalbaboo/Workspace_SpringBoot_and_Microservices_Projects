package com.llb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {
	
	@GetMapping("/course")
	@ResponseBody
	public String getCourseData() {
		
		String msg = "Welcome to Spring Boot course...";
		
		return msg;
	}
	

}
