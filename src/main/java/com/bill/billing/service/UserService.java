package com.bill.billing.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bill.billing.entity.User;
import com.bill.billing.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public Iterable<User> findAll()
	{
		return repo.findAll();
	}
	
	public User findUserById(Long id)
	{
		Optional<User> userObject = repo.findById(id);
		return userObject.get();
	}
	
	public void deleteUser(Long id)
	{
		repo.deleteById(id);
	}
	
	public User findUserByName(String name) throws Exception
	{
		User user = repo.findByUsername(name);
		if(user==null)
		{
		throw new Exception("user not present in database");
		}
		return user;
	}
}
