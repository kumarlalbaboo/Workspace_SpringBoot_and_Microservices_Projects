package com.llb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.llb.entity.User;
import com.llb.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add_user_details")
	public User addUserDetails(@RequestBody User user) {
		return userService.addUserDetails(user);
	}
	
	@GetMapping("/get_users")
	public List<User> getUsersDetails() {
		return userService.getUsersDetails();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

	@PutMapping("/update_user_byId/{id}")
	public User updateUserDetails(@RequestBody User user, @PathVariable Integer id ) {
		return userService.updateUserDetails(user, id);
	}
	
	@DeleteMapping("/delete_user/{id}")
	void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
}
