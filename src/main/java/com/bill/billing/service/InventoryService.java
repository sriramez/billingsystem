package com.bill.billing.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.billing.entity.Inventory;
import com.bill.billing.repository.InventoryRepository;

@Service
public class InventoryService {

	@Autowired
	InventoryRepository repo;
	
	public Inventory saveInventory(Inventory Inventory)
	{
		return repo.save(Inventory);
	}
	
	public Iterable<Inventory> findAll()
	{
		return repo.findAll();
	}
	
	public Inventory findInventoryById(Long id)
	{
		Optional<Inventory> InventoryObject = repo.findById(id);
		return InventoryObject.get();
	}
	
	public void deleteInventory(Long id)
	{
		repo.deleteById(id);
	}
}
