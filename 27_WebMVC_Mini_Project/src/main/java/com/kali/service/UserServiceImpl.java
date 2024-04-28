package com.kali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kali.entity.User;
import com.kali.repo.UserRepo;
import com.kali.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private EmailUtils emailUtils;
	
	@Override
	public boolean saveuser(User user) {
		
		User savedUser= userRepo.save(user);
		
		if(savedUser.getUid()!=null) {
			String subject="Your Account Created - Programming";
			String body="<h1>Congratulations, welcome to board....</h1>";
			emailUtils.sendEmail(user.getEmail(), subject, body);
		}
		return true;
	}

	@Override
	public User getUser(String email, String pwd) {
		
		return userRepo.findByEmailAndPwd(email, pwd);
	}

}
