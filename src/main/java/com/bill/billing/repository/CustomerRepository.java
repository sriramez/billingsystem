package com.bill.billing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bill.billing.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
