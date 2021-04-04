package com.bill.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bill.billing.entity.User;
import com.bill.billing.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("create")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("all")
	public Iterable<User> getAllUsers()
	{
		return userService.findAll();
	}
	
	@GetMapping("find")
	public User findUser(@RequestParam Long id)
	{
		return userService.findUserById(id);
	}
	
	@DeleteMapping("delete")
	public Long deleteUser(@RequestParam Long id)
	{
		userService.deleteUser(id);
		return id;
	}

}
