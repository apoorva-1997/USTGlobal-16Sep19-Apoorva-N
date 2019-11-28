package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class Reattaching {

	public static void main(String[] args) {

		EntityTransaction entityTransaction =null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product product = entityManager.find(Product.class,2); 
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);					/*data cannot be updated as detach() is used*/
			System.out.println(entityManager.contains(product));
			Product product1 = entityManager.merge(product);
			product1.setPname("mobile"); 					/* even after detach merge can update data */
			System.out.println("updated");
			entityTransaction.commit();


		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

	}
}
