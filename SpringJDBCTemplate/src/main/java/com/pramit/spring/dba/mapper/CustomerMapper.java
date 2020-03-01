package com.pramit.spring.dba.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pramit.spring.dba.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cst = new Customer();
		cst.setId(rs.getInt("CUSTOMER_ID"));
		cst.setName(rs.getString("CUSTOMER_NAME"));
		cst.setEmail(rs.getString("EMAIL_ID"));
		cst.setCity(rs.getString("CITY"));
		return cst;
	}

}
