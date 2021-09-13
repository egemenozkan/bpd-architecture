package com.birprojedaha.app.data.jdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.birprojedaha.app.data.jdbc.model.SocialMediaAccount;


@Repository
public interface SocialMediaAccountRepository extends CrudRepository<SocialMediaAccount, Long>{

}
