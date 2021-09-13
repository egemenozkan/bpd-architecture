package com.birprojedaha.app.data.jdbc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("t_address")
public class Address {
	
//	@Id
//	private long addressId;
	private String city;

}
