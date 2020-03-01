package com.pramit.spring.dba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramit.spring.dba.impl.CustomerDAOImpl;
import com.pramit.spring.dba.model.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDAOImpl service;
	
	@RequestMapping("/allCustomers")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomer();
	}
	
	@RequestMapping(value="/allCustomers/{cust_id}",produces="application/json")
	public Customer getCustomerById(@PathVariable int cust_id) {
		return service.getCustomerById(cust_id);
	}
}
