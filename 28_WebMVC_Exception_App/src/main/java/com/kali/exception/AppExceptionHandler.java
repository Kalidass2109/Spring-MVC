package com.kali.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler { //global exception handling

	@ExceptionHandler(value=Exception.class)
	public String handleAe(Exception ae) {
		
		return "exView";
	}
	
	@ExceptionHandler(value=ProductNotFoundException.class)
	public String handleProductEx(ProductNotFoundException pne) {
		//logic
		return "exView";
	}
	
}
