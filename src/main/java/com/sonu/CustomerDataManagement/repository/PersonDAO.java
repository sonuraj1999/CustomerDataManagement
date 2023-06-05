package com.sonu.CustomerDataManagement.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sonu.CustomerDataManagement.entity.Person;

@Repository
public class PersonDAO {

	@Autowired
	private PersonRepository repository;
	public Person save(Person person) {
		return repository.save(person);
	}
}
