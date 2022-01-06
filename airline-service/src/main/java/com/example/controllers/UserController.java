package com.example.controllers;

import java.util.List;


import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.customer.UserDetails;
import com.example.service.IUserService;



public class UserController {
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/user")
	@ResponseStatus(code = HttpStatus.CREATED)
	Integer createUser(@Valid @RequestBody User user) throws Exception {
		userService.save(user);
		return ((UserDetails) user).getId();
	}
	
	@DeleteMapping("/user/{id}")
	void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
	@PutMapping("/user/{id}")
	void updateUser(@RequestBody User user, @PathVariable Integer id) {
		userService.updateUser(user, id);
	}
	@GetMapping("/user")
	List<UserDetails> getAllUsers() {
		return userService.getAllUser();
	}

}
