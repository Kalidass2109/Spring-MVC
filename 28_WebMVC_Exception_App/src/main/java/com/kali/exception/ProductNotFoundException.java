package com.kali.exception;

public class ProductNotFoundException extends Exception{ //to handle user defined exceptions
	
	public ProductNotFoundException() {
		
	}
	
	public ProductNotFoundException(String msg) {
		super(msg);
	}
	

}
