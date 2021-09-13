package com.birprojedaha.app.service;

import java.util.List;

import com.birprojedaha.app.service.dto.UserDto;

public interface IUserService {
	UserDto save(UserDto userDto);
	UserDto findById(long id);
	UserDto findByFirstName(String firstName);
	List<UserDto> findAll();
	
	
}
