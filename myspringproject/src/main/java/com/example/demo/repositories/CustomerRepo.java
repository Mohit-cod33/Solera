package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Customer;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {

	Customer findByDealerName(String customerName);

}
