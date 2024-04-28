package com.kali.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.kali.entity.Contact;
import com.kali.repo.ContactRepo;

//Runner is used to execute in code only once when the application is started
@Component
public class MyAppRunner implements ApplicationRunner{

	@Autowired
	private ContactRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Contact c1=new Contact();
		c1.setName("John");
		c1.setPhno(123443454);
		
		Contact c2=new Contact();
		c2.setName("Smith");
		c2.setPhno(3235234);
		
		repo.saveAll(Arrays.asList(c1, c2));
	}

}
