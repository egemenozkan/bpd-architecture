package com.birprojedaha.app.data.jdbc.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.birprojedaha.app.data.jdbc.model.Role;
import com.birprojedaha.app.data.jdbc.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findByFirstName(String firstName);
	
	@Query("SELECT tr.id, tr.name FROM t_user_role tur LEFT JOIN t_role tr ON tr.id = tur.role_id WHERE tur.user_id = :userId")
	@Transactional(readOnly = true)
	List<Role> findAllUserRolesById(long userId);
}
