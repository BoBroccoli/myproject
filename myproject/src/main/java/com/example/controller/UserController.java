package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.IUserService;

@RestController
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping("/email/{id}")
	public ResponseEntity<User> getUserByEmail(@PathVariable("id") int id) {
		User user = userService.findByEmail(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	@RequestMapping("/register")
	public boolean register(@RequestParam (value="id")int id, @RequestParam(value="Email") String Email, 
			@RequestParam(value="password") String password) {
		User user = new User(id, Email,password);
		return userService.save(user);
	}
}
