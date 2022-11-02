package com.cognixia.jump.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customer_id; 
	
	@Column
	private String address;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Date dob;
	
	public Customer() {}

	public Customer(Integer customer_id, String address, String first_name, String last_name, Date dob) {
		super();
		this.customer_id = customer_id;
		this.address = address;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", address=" + address + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", dob=" + dob + "]";
	}
	

}
