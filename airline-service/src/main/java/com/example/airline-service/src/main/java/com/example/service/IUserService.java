package com.example.service;

import java.util.List;

import javax.validation.Valid;

import org.apache.catalina.User;

import com.example.customer.UserDetails;

public interface IUserService {
	String save(@Valid User user) throws Exception;

	List<UserDetails> getAllUser();

	void updateUser(User user, Integer id);

	void deleteUser(Integer id);

	String save(UserDetails user) throws Exception;

	void updateUser(UserDetails user, Integer id);
}
