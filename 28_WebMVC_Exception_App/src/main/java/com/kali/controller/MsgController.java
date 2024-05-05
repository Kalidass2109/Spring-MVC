package com.kali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcome(Model model) {
		int i=10/0;
		
		model.addAttribute("msg", "Welcome to Programming world...");
		
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreet(Model model) {
		model.addAttribute("msg", "Welcome to Programming world...");
		return "index";
	}

}
