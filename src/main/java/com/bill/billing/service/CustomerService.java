package com.bill.billing.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.billing.entity.Customer;
import com.bill.billing.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public Customer createCustomer(Customer customer)
	{
		return repo.save(customer);
	}
	
	public Iterable<Customer> findAll()
	{
		return repo.findAll();
	}
	
	public Customer findById(Long id)
	{
		return repo.findById(id).get();
	}
	
	public void deleteByID(Long id)
	{
		repo.deleteById(id);
	}
}
