package com.sonu.CustomerDataManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonu.CustomerDataManagement.entity.Person;
import com.sonu.CustomerDataManagement.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
		@PostMapping("/person")
		public Person savePerson(@RequestBody Person person) {
			return service.savePerson(person);
		}
	}

