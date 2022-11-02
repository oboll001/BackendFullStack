package com.cognixia.jump.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Customer;
import com.cognixia.jump.repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerRepository custRepo;
	
	@GetMapping("/customer/all")
	public List<Customer> getAllCustomer(){
		return custRepo.findAll();
	}
	
	@GetMapping("/customer/one")
	public Customer getOneCustomer(@RequestParam Integer CID) {
		return custRepo.getById(CID);
	}
	
	
	
}
