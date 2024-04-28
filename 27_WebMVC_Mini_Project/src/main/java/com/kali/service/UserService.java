package com.kali.service;

import com.kali.entity.User;

public interface UserService {

	public boolean saveuser(User user);
	
	public User getUser(String email, String pwd);
}
