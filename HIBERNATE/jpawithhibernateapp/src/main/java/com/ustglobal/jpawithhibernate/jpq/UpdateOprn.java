package com.ustglobal.jpawithhibernate.jpq;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateOprn {

	public static void main(String[] args) {
		EntityManager  entityManager =null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql ="update from Product set pname = 'sharpner' where pid = 2";
			Query qry = entityManager.createQuery(jpql);
			int result = qry.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
		
	}
}
