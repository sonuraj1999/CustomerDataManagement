package com.sonu.CustomerDataManagement.dto;

import java.io.Serializable;

import com.sonu.CustomerDataManagement.entity.Customer;

import lombok.Data;


@Data
public class CustomerDTO implements Serializable{
	
	private Integer id;
	private String name;
	private String email;
	
	public CustomerDTO(Customer customer) {
		this.id=customer.getId();
		this.name=customer.getName();
		this.email=customer.getEmail();
	}

}
