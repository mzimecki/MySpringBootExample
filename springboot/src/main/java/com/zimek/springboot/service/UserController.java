package com.zimek.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceRepository repo;
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String addUser(@RequestParam("name") String name) {
		repo.addUser(name);
		return "User " + name + " added!";
	}
}
