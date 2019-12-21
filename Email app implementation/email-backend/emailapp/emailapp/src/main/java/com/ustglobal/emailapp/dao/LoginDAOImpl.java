package com.ustglobal.emailapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.emailapp.dto.User_Info;
@Repository
public class LoginDAOImpl implements LoginDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User_Info login(String email, String password) {

		EntityManager manager = factory.createEntityManager();
		String jpql = "from User_Info where email=:email and password=:password";
		TypedQuery< User_Info> query = manager.createQuery(jpql, User_Info.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User_Info info  = query.getSingleResult();
			return info;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
