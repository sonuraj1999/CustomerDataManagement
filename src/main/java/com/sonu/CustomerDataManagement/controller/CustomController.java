package com.sonu.CustomerDataManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonu.CustomerDataManagement.dto.ResponseStructure;
import com.sonu.CustomerDataManagement.entity.Customer;
import com.sonu.CustomerDataManagement.service.CustomerService;

@RestController
public class CustomController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/customer")
	public @ResponseBody Customer saveCustomer(@RequestBody Customer customer ) {
	return service.saveCustomer(customer);
	}
	@PutMapping("/customer")
	public @ResponseBody ResponseStructure<Customer> updateCustomer(@RequestBody Customer customer) {
	 return service.updateCustomer(customer);
}
    @GetMapping("/customer")
	public @ResponseBody ResponseStructure<List<Customer>> getAllCustomer(){
		return service.getAllCustomerData();
	}
    @GetMapping("/customer/{id}")
    public  @ResponseBody Customer getCustomerDataById(@PathVariable("id") int id) {
    	return service.getCustomerDataById(id);
    	
    }
    @DeleteMapping("/customer")
    public @ResponseBody Customer deleteCustomerDataById(@RequestParam("id")int id) {
    	return service.deleteCustomerDataById(id);
    	
    }
    @GetMapping("/customerbyname/{name}")
    public  @ResponseBody  List<Customer> getCustomerByName(@PathVariable("name") String name) {
    	return service.getCustomerByName(name);
    }
    @PostMapping("/validatecustomer")
    public List<Customer> validateCustomer(@RequestParam("name") String name,
    		@RequestParam("email")String email){
    	return service.validateCustomer(name, email);
    }
    
}