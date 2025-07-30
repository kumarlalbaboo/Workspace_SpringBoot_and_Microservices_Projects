package com.llb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	// URL : https://localhost:8080/greet
	@GetMapping("/greet")
	public ModelAndView greetMsg() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Good morning..");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to learn Spring WebMVC..!!");
		
		mav.setViewName("index");
		
		return mav;
	}
	
	@GetMapping("/welcome1")
	public String welcomeMsg(Model model) {
		
		model.addAttribute("msg", "Welcome to learn Spring WebMVC");
		
		return "index";
	}
	

}
