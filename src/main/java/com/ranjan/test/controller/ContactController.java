package com.ranjan.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjan.test.entity.Contact;
import com.ranjan.test.services.ContactServices;

@RestController
@RequestMapping("/Apna-Bus")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {
    
    @Autowired
    private ContactServices contactService;

    @PostMapping("/submit")
    public ResponseEntity<Contact> submitContact(@RequestBody Contact contact) {
        Contact savedContact = contactService.saveContact(contact);
        return new ResponseEntity<>(savedContact, HttpStatus.CREATED);
    }
}
