package com.tminnova.api.service;

import java.util.List;

import com.tminnova.api.model.User;
import com.tminnova.api.model.UserDto;

public interface UserService {

	User create(UserDto user);

	List<User> findAll();

	User delete(long id);
	
	User findById(long id);
	
	User update(UserDto user);

	User findOne(String username);

	

}
