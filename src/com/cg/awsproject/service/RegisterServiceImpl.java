package com.cg.awsproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.awsproject.dao.RegisterDAOImpl;
import com.cg.awsproject.entity.UserNames;
@Service
@Component("registerService")

public class RegisterServiceImpl implements RegisterService {
	
	
	@Autowired
	RegisterDAOImpl rdao;
	
	@Override
	public String register(UserNames name) {
		// TODO Auto-generated method stub
		return rdao.insertRegistration(name);
	}

	@Override
	public List<UserNames> getUserNames() {
		// TODO Auto-generated method stub
		return rdao.getUserNames();
	}
}
