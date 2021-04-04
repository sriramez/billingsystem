package com.bill.billing.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bill.billing.entity.Inventory;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Long>{

}
