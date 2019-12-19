package com.ustglobal.lmsp.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;

@Repository
public class AdminDAOImpl implements AdminDAO {

	public static int uid;

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean register(Admin adminbean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(adminbean);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public Admin login(Admin adminbean) {
		this.uid = adminbean.getId();
		String jpql = "from Admin where email=:email and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Admin> query = manager.createQuery(jpql,Admin.class);
		query.setParameter("email", adminbean.getEmail());
		query.setParameter("pass", adminbean.getPassword());
		try {
			Admin admin = query.getSingleResult();
			return admin;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
