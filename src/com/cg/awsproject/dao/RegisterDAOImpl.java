package com.cg.awsproject.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.awsproject.entity.UserNames;


@Repository
public class RegisterDAOImpl implements RegisterDAO {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public String insertRegistration(UserNames name) {
		
		
		em.persist(name);
		return name.getName();
	}

	@Override
	public List<UserNames> getUserNames() {
		// TODO Auto-generated method stub
		System.out.println("DAO");
		Query query = em.createQuery("FROM UserNames");
		List<UserNames> userList = query.getResultList();
		System.out.println(userList);
		System.out.println("user list printed.");
		return userList;
	}
}
