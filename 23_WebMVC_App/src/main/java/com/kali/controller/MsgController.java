package com.kali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg1() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Welcome to programming");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getMsg2() {
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("msg", "Good Morning... ");
		mav.setViewName("index");
		return mav;
	
	}
}
