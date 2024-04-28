package com.kali.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kali.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
