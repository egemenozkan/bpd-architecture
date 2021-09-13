package com.birprojedaha.app.data.jdbc.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private Long id;
	private String firstName;
	private String lastName;


}
