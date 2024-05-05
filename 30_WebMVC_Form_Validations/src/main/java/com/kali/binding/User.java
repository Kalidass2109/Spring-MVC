package com.kali.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotEmpty(message = "Name is Mandatory") //notEmpty used to check empty of string
	@Size(min=3, max=8, message = "Min 3 and Max 8 chars allowed")
	private String name;
	
	@NotEmpty(message = "Email is Mandatory")
	@Email(message="Enter valid Email")
	private String email;
	
	@NotNull(message = "Phno is Mandatory")
	private Long phno;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", phno=" + phno + "]";
	}
}
