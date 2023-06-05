package com.sonu.CustomerDataManagement.service;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sonu.CustomerDataManagement.dto.CustomerDTO;
import com.sonu.CustomerDataManagement.dto.ResponseStructure;
import com.sonu.CustomerDataManagement.entity.Customer;
import com.sonu.CustomerDataManagement.repository.CustomerDAO;
import com.sonu.CustomerDataManagement.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public Customer saveCustomer(Customer customer) {
		Customer cus = new Customer(customer);
		return dao.saveCustomer(cus);
		
	}
	
	
	public ResponseStructure <Customer> updateCustomer(Customer customer) {
		Customer cus = dao.saveCustomer(customer);
		ResponseStructure<Customer> rs= new ResponseStructure<>();
		rs.setData(cus);
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		rs.setMessage(HttpStatus.ACCEPTED.name());
		rs.setTimeStamp(LocalDateTime.now());
		return rs; 
	
	}

	public ResponseStructure<List<Customer>> getAllCustomerData() {
		List<Customer> list = dao.getAllCustomerData();
		ResponseStructure<List<Customer>> rs= new ResponseStructure<>();
		if(list.size()!=0) {
			rs.setStatusCode(HttpStatus.FOUND.value());
			rs.setData(list);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("Customer entry found in database");
		}else {
			rs.setStatusCode(HttpStatus.NOT_FOUND.value());
			rs.setData(null);
			rs.setTimeStamp(LocalDateTime.now());
			rs.setMessage("no customer entry found in data");
		}
		return rs;
		
	}

	public Customer getCustomerDataById(int id) {
		return dao.getCustomerDataById(id);
	}

	public Customer deleteCustomerDataById(int id) {
		return dao.deleteCustomerDataById(id);
	}
	
	public List<Customer> getCustomerByName(String name){
		throw new InputMismatchException();
		//	return dao.getCustomerByName(name);
	}
	public List<Customer> validateCustomer(String name, String email){
		return dao.validateCustomer(name, email);
	}
}
