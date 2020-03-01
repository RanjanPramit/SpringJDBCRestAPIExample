package com.pramit.spring.dba.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.pramit.spring.dba.dao.CustomerDAO;
import com.pramit.spring.dba.mapper.CustomerMapper;
import com.pramit.spring.dba.model.Customer;

@Service
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String FETCH_ALL = "Select CUSTOMER_ID,CUSTOMER_NAME,EMAIL_ID,CITY from CUSTOMER_TABLE";

	private static final String FETCH_BY_ID = "Select * from CUSTOMER_TABLE where CUSTOMER_ID = ";

	@Override
	public List<Customer> getAllCustomer() {
		return jdbcTemplate.query(FETCH_ALL, new CustomerMapper());
	}

	@Override
	public Customer getCustomerById(int id) {
		String SQL = FETCH_BY_ID + id;
		return jdbcTemplate.queryForObject(SQL, new CustomerMapper());
	}

}
