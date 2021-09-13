package com.birprojedaha.app.data.jdbc.model;

import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table("t_user_role")
@AllArgsConstructor
public class RoleRef {
	private int roleId;
}
