package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			Product product = entityManager.getReference(Product.class, 2); /* getReference method provides proxy address od the data*/
			System.out.println(product.getClass());

//			Product product = entityManager.find(Product.class, 2); 		/* find method to search the data*/
			
			System.out.println("Id is "+product.getPid());
			System.out.println("Name is "+product.getPname());
			System.out.println("Quantity is "+product.getQuantity());
			entityManager.close();
	}
}