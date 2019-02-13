package com.cg.awsproject.service;

import java.util.List;

import com.cg.awsproject.entity.UserNames;

public interface RegisterService {

	String register(UserNames name);
	List<UserNames> getUserNames();
}
