package com.birprojedaha.app.data.jdbc.model;

import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table("t_role")
@AllArgsConstructor
public class Role {
	
	private int id;
	private String name;

}
