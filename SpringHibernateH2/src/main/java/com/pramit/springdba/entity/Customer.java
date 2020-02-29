package com.pramit.springdba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "CUSTOMER_TABLE")
public class Customer {

	@Id
	@NotNull
	@GeneratedValue
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "CITY")
	private String city;

	public Customer() {

	}

	public Customer(int id, String name, String emailId, String city) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getCity() {
		return city;
	}

}
