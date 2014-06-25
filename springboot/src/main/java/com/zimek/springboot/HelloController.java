package com.zimek.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zimek.springboot.service.User;
import com.zimek.springboot.service.UserServiceRepository;

@Controller
public class HelloController {
	
	@Autowired
	private UserServiceRepository repo;
	
	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		List<User> users = new ArrayList<User>(repo.getAllUsers().values());
		model.put("users", users);
		return "hello";
	}
}
