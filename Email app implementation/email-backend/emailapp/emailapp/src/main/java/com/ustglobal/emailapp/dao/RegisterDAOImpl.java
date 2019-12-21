package com.ustglobal.emailapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.ustglobal.emailapp.dto.User_Info;

@Repository
public class RegisterDAOImpl implements RegisterDAO {
	
	
@PersistenceUnit
	private EntityManagerFactory  factory;
	
	@Override
	public boolean registerUser(User_Info info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(info);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
