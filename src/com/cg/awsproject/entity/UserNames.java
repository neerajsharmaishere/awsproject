package com.cg.awsproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usernames")
public class UserNames {
	
	@Id
	@Column(name="names")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UserNames(String name) {
		super();
		this.name = name;
	}

	public UserNames() {
		super();
	}


}
