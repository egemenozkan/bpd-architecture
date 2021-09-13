package com.birprojedaha.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.birprojedaha.app.data.jdbc.model.User;
import com.birprojedaha.app.data.jdbc.repository.SocialMediaAccountRepository;
import com.birprojedaha.app.data.jdbc.repository.UserRepository;
import com.birprojedaha.app.service.IUserService;
import com.birprojedaha.app.service.dto.UserDto;
import com.birprojedaha.app.service.modelmapper.UserModelMapper;

@Service
public class UserService implements IUserService{

	private UserModelMapper userModelMapper = UserModelMapper.INSTANCE;

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SocialMediaAccountRepository socialMediaAccountRepository;
	
	@Override
	public UserDto save(UserDto userDto) {
		User user = userModelMapper.dtoToModel(userDto);
		User userResult = userRepository.save(user);
		return userModelMapper.modelToDto(userResult);
	}


	@Override
	public UserDto findById(long id) {
		User userDemo = new User();
		userDemo.setFirstName("Egemen");
		userDemo.setLastName("Ozkan");
		
		UserDto userDto = userModelMapper.modelToDto(userDemo);
		return userDto;
	}


	@Override
	public UserDto findByFirstName(String firstName) {
		User user = null;
		
		return userModelMapper.modelToDto(user);		
	}


	@Override
	public List<UserDto> findAll() {
		Iterable<User> users = userRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		users.forEach(row-> userDtos.add(userModelMapper.modelToDto(row)));
		return userDtos;
	}

}
