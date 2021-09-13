package com.birprojedaha.app.controller;

import com.intuit.karate.junit5.Karate;

//@SpringBootTest
public class UserRestControllerKarateTest {

	@Karate.Test
	Karate usersKarate() {
		return Karate.run("Users").relativeTo(getClass());
	}
}
