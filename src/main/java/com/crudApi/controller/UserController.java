package com.crudApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudApi.model.User;
import com.crudApi.repository.UserRepository;



@RestController
@CrossOrigin("http://localhost:2444")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}
	
	
	@GetMapping("/get_users")
	
	List<User> getALlUsers() {
		
		return userRepository.findAll();
		
	}
	
}
