package com.llb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.llb.entities.User;
import com.llb.services.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/dbdata")
	public String viewHomePage(Model model) {
		
		List<User> list = userService.getUsers();
		
		model.addAttribute("users", list);
		
		return "index";
	}
	
	
}
