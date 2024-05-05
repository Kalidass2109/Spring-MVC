package com.kali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MsgController {
	
	@GetMapping("/greet/{name}")
	public String greetMethod(@PathVariable("name") String name,Model model) {
		model.addAttribute("msg", name+", Good Morning");
		
		return "index";
	}/* http://localhost:8080/greet/kali */
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMethod(@RequestParam("name") String name) {
		
		return name+", Welcome to Programming world.."; //As return type is string, by default boot is understanding this is view name
												//in order to make it understand, we must define ResponseBody annotation for direct response
	} /* http://localhost:8080/welcome?name=kali */

}
