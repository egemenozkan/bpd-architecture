package com.birprojedaha.app.data.jdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.birprojedaha.app.data.jdbc.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByFirstName(String firstName);
	
}
