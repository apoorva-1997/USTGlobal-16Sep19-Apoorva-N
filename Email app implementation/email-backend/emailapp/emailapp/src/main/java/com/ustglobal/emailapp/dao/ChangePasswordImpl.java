package com.ustglobal.emailapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.emailapp.dto.User_Info;

@Repository
public class ChangePasswordImpl implements ChangePassword{

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean changepassword(String email, String password) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "from User_Info where email=:email";
		TypedQuery<User_Info> query = manager.createQuery(jpql, User_Info.class);
		transaction.begin();
		query.setParameter("email", email);
		try {
			User_Info user = query.getSingleResult();
			User_Info users =manager.find(User_Info.class, user.getPassword());
			users.setPassword(password);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}



	}
}
