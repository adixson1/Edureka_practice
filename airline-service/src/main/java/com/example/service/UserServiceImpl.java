package com.example.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.customer.UserDetails;
import com.example.repository.UserRepository;

public class UserServiceImpl implements IUserService {
	@Autowired
	UserRepository repository;
	
	@Transactional(rollbackOn = Exception.class)
	public String save(UserDetails user) throws Exception {
		System.out.println(user.getId());
		repository.save(user);
		return user.getFirstName()+ user.getLastName();
	}

	@Override
	public List<UserDetails> getAllUser() {
		return repository.findAll();
	}

	public void updateUser(UserDetails user, Integer id) {
		user.setId(id);
		repository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public String save(@Valid User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user, Integer id) {
		// TODO Auto-generated method stub
		
	}

}
