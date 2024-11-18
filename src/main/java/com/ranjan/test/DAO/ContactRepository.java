package com.ranjan.test.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjan.test.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
