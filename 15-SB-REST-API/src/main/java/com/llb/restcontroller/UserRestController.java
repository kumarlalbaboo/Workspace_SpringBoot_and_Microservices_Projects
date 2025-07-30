package com.llb.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.llb.dto.User;

@RestController
public class UserRestController {

	@PostMapping(value = "/user", consumes = { "application/json", "application/xml" }, produces = "text/plain")
	public ResponseEntity<String> createUser(@RequestBody User user) {

		System.out.println(user);

		// TODO : save in Database using data jpa

		String msg = "User Created";

		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/user2", produces = { "application/json", "application/xml" })
	public ResponseEntity<User> getUser() {

		User user = new User(101, "Raj", "raj@gmail.com");

		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
