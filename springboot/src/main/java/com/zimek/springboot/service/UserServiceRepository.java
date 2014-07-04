package com.zimek.springboot.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserServiceRepository extends CrudRepository<User, Long>, JpaRepository<User, Long> {
	
	public List<User> findAll();
	public User save(User user);
	public List<User> findByName(String name);
	
}
