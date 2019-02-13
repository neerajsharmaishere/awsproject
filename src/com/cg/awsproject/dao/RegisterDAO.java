package com.cg.awsproject.dao;

import java.util.List;

import com.cg.awsproject.entity.UserNames;

public interface RegisterDAO {

	String insertRegistration(UserNames name);
	List<UserNames> getUserNames();
}
