package com.zimek.springboot.service;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UserServiceRepository {
	
	private final Map<String, User> users = new ConcurrentHashMap<String, User>();
	
	public synchronized Map<String, User> getAllUsers() {
		return Collections.unmodifiableMap(users);
	}
	
	public void addUser(String name) {
		User u = new User(name);
		users.put(u.getUserData()[0], u);
	}
	
}
