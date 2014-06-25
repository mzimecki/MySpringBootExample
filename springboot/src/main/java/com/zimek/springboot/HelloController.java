package com.zimek.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@ModelAttribute("user") User user) {
        if (null != user && null != user.getUserData()[1] && !user.getUserData()[1].isEmpty()) {
        	repo.addUser(user.getUserData()[1]);
        }
        return "redirect:/";
    }
}
