package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction  entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Product product = entityManager.find(Product.class, 103);
			entityManager.remove(product);
			
			System.out.println("Deleted Record Succesfully");
			
			entityTransaction.commit();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
			
		} entityManager.close();
	}//end of main
}//end of DeleteDemo
