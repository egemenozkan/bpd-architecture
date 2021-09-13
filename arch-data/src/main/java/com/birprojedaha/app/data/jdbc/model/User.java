package com.birprojedaha.app.data.jdbc.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("t_user")
public class User {

	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthDate;

	/** One to One **/
	@MappedCollection(idColumn = "user_id")
	private Address address;

	/** Many To Many **/
	@MappedCollection(idColumn = "user_id")
	private Set<RoleRef> roles = new HashSet<>();

	/** One to Many **/
	@MappedCollection(keyColumn = "nebu_id", idColumn = "user_id")
	private Set<SocialMediaAccount> socialMediaAccounts;

	public void addRole(Role role) {
		roles.add(new RoleRef(role.getId()));
	}

	public void addRole(int roleId) {
		roles.add(new RoleRef(roleId));
	}

}
