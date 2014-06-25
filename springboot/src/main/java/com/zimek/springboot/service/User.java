package com.zimek.springboot.service;

import java.util.UUID;

public class User {
	private String id;
	private String name;
	
	public User() {
		
	}
	
	public User(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
	
	public synchronized String [] getUserData() {
		return new String [] {this.id, this.name};
	}

	public synchronized void setName(String name) {
		this.name = name;
	}
}
