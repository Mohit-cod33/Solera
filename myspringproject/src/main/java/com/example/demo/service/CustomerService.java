package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Customer;



public interface CustomerService {
	//CRUD
	//Create
	public Customer createDealer(Customer customer);
	public Customer updateDealer(Customer customer);
	public String deleteDealer(Integer customerId);
	public Customer retrieveDealer(Integer customerId);
	public List<Customer> retrieveAllCustomer();
	public Customer retrieveDealerByName(String customerName);
}
