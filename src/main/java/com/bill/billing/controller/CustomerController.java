package com.bill.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bill.billing.entity.Customer;
import com.bill.billing.service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping("create")
	public Customer createCustomer(@RequestBody Customer customer)
	{
		return service.createCustomer(customer);
	}
	
	@GetMapping("findall")
	public Iterable<Customer> findAll()
	{
		return service.findAll();
	}
	
	@GetMapping("find")
	public Customer findCustomerById(@RequestParam Long id)
	{
		return service.findById(id);
	}
	
	@DeleteMapping("delete")
	public Long deleteCustomerById(@RequestParam Long id)
	{
	service.deleteByID(id);
	return id;
	}
}
