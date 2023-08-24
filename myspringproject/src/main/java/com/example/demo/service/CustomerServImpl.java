package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepo;



@Service
public class CustomerServImpl implements CustomerService {
	@Autowired
	CustomerRepo custrepo;
	
	@Override
	public Customer createDealer(Customer customer) {
		
		return custrepo.save(customer);
	}

	@Override
	public Customer updateDealer(Customer customer) {
		
		Optional<Customer> delr =custrepo.findById(customer.getDealerId());
		if(delr.isPresent()) {
			return custrepo.save(customer);
			
		}
		return null;
	}

	@Override
	public String deleteDealer(Integer dealerId) {
		custrepo.deleteById(dealerId);
		return "Dealer deleted";
	}

	@Override
	public Customer retrieveDealer(Integer customerId) {
		Optional<Customer> delr =custrepo.findById(customerId);
		if(delr.isPresent()) {
			return delr.get();
		}
		return null;
	}


	@Override
	public Customer retrieveDealerByName(String customerName) {
		
		return custrepo.findByDealerName(customerName);
	}

	@Override
	public List<Customer> retrieveAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
