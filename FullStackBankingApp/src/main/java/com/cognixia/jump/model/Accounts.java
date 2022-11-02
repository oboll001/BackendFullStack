package com.cognixia.jump.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer account_id; 
	
	@Column
	private String account_name;
	
	@Column
	private String account_type;
	
	@Column
	private Double balance;
	
	@Column
	private Integer customer_id;
	
	public Accounts() {
		
	}
	
	public Accounts(String account_name, String account_type, Double balance, Integer customer_id) {
		super();
		this.account_id = -1;
		this.account_name = account_name;
		this.account_type = account_type;
		this.balance = balance;
		this.customer_id = customer_id;
	}
	
	public Accounts(Integer account_id, String account_name, String account_type, Double balance, Integer customer_id) {
		super();
		this.account_id = account_id;
		this.account_name = account_name;
		this.account_type = account_type;
		this.balance = balance;
		this.customer_id = customer_id;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Accounts [account_id=" + account_id + ", account_name=" + account_name + ", account_type="
				+ account_type + ", balance=" + balance + ", customer_id=" + customer_id + "]";
	}
	
	
}
