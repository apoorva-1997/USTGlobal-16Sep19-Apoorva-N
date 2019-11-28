package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction  entityTransaction = null;
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
		/*
		 * getReference() doesn't hit data base unnecessarily.
		 *  gives EntityNotFoundException if primary key is not present in db.
		 *  gives proxy object address
		 */			
			Product product = entityManager.getReference(Product.class, 102);
			System.out.println(product.getClass());
			
		/*
		 *  find() doesn't hit data base unnecessarily.
		 *  gives NullPointerException if primary key is not present in db.
		 *  gives actual obj address
		 */		
//			Product product = entityManager.find(Product.class, 102);
//			System.out.println(product.getClass());
		
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			
			entityTransaction.commit();
			
		 entityManager.close();
	}//end of main

}//end of GetReference
