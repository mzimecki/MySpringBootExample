package com.zimek.springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserServiceRepository {
	
	private Map<String, User> users = new HashMap<String, User>();
	
	public Map<String, User> getAllUsers() {
		return users;
	}
	
	public void addUser(String name) {
		User u = new User(name);
		users.put(u.getId(), u);
	}
	
}
