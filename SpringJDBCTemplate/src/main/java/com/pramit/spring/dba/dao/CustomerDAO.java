package com.pramit.spring.dba.dao;

import java.util.List;

import com.pramit.spring.dba.model.Customer;

public interface CustomerDAO {
	
	List<Customer> getAllCustomer();
	Customer getCustomerById(int id);

}
