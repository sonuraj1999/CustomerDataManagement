package com.sonu.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.sonu.CustomerDataManagement.entity.Person;

public interface  PersonRepository extends JpaRepository <Person, Integer> {

}
