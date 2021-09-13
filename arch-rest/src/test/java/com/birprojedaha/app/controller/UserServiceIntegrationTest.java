package com.birprojedaha.app.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.birprojedaha.app.service.IUserService;

@SpringBootTest
class UserServiceIntegrationTest {

	@Autowired
	IUserService userService;
	
	
	@Test
	final void test() {
		fail("Not yet implemented"); // TODO
	}

}
