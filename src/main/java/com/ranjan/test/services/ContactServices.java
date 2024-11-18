package com.ranjan.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranjan.test.DAO.ContactRepository;
import com.ranjan.test.entity.Contact;

@Service
public class ContactServices {
    
    @Autowired
    private ContactRepository contactRepository;
    
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}
