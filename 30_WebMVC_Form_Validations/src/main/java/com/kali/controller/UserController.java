package com.kali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kali.binding.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@PostMapping("/user")
	public String handleSubmit(@Valid User user,BindingResult result, Model model) {
		//BindingResult used to verify our form validations are successful or failed
		
		if(result.hasErrors()) {
			//validation failed
			return "index";
		}else {
			//validation failed
			System.out.println(user);
			model.addAttribute("msg", "User Saved");
			//logic
			return "index";
		}
	}

}
