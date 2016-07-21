package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping(value = "/home")
	public String home(Model model){
		System.out.println("home");
		model.addAttribute("home", "home");
		return "home";
	}
}
