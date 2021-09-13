package com.birprojedaha.app.data.jdbc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("t_socialmedia_account")
public class SocialMediaAccount implements Persistable<Long>  {
	
	@Id
	private long id;
	private String accountId;
	
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public boolean isNew() {
		return id == 0;
	}
	
	

	
}
