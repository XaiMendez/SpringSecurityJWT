package com.tminnova.api.service;

import java.util.List;

import com.tminnova.api.model.User;
import com.tminnova.api.model.UserDto;

public interface UserService {

	User save(UserDto user);

	List<User> findAll();

	void delete(long id);

	User findOne(String username);

	User findById(long id);

}
