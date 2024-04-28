package com.kali.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kali.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	public User findByEmailAndPwd(String email, String pwd);

}
