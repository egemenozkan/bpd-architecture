package com.birprojedaha.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.birprojedaha.app.service.IUserService;
import com.birprojedaha.app.service.dto.UserDto;

@RestController
public class UserRestController {

	@Autowired
	private IUserService userService;
	
	@GetMapping("/users/{id}")
	public UserDto getUser(@PathVariable long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/users2")
	public UserDto getUserByFilters(@RequestParam String firstname) {
		return userService.findByFirstName(firstname);
	}
	
	@GetMapping("/users")
	public List<UserDto> getUsers() {
		return userService.findAll();
	}
	
	@PostMapping("/users")
	public ResponseEntity<UserDto> insertUser(@RequestBody UserDto userDto) {
		try {
			UserDto userResultDto = userService.save(userDto);
			return ResponseEntity.status(HttpStatus.OK).body(userResultDto);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
}
