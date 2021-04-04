package com.bill.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bill.billing.entity.Inventory;
import com.bill.billing.service.InventoryService;

@RestController
@RequestMapping("inventory")
public class InventoryController {

	@Autowired
	InventoryService service;

	@PostMapping("create")
	public Inventory createInventory(@RequestBody Inventory inventory) {
		return service.saveInventory(inventory);
	}
	
	@GetMapping("all")
	public Iterable<Inventory> getAllInventory()
	{
		return service.findAll();
	}
	
	@GetMapping("find")
	public Inventory findInventory(@RequestParam Long id)
	{
		return service.findInventoryById(id);
	}
	
	@DeleteMapping("delete")
	public Long deleteInventory(@RequestParam Long id)
	{
		service.deleteInventory(id);
		return id;
	}

}
