package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.User;
import com.ssm.service.UserService;

@Controller
public class HomeController {

    @Autowired
    private UserService userService = null;  
    
	@RequestMapping(value = "/home")
	public String home(Model model){
	
		model.addAttribute("home", "home");
		User user = userService.findUser(1);
		System.out.println(user.getName());
		return "home";
	}
}
