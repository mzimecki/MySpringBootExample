package com.mzimecki.springboot.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserServiceRepository extends JpaRepository<User, Long> {
	
	public List<User> findAll();
	public User save(User user);
	public List<User> findByName(String name);
}
