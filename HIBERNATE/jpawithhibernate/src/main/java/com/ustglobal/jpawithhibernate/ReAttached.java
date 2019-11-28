package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReAttached {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Product product = entityManager.find(Product.class, 101);

			/* use to check whether the object is present or not */
			System.out.println(entityManager.contains(product));
			
			/* It doesn't update in db bcz it removes connection with db */			
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			
			/* use to reattach with detached db */		
			Product product2 = entityManager.merge(product);
			
			product2.setPname("Book");
			System.out.println("Updated the record");

			/*
			 * System.out.println(product.getPid()); 
			 * System.out.println(product.getPname());
			 * System.out.println(product.getQuantity());
			 */

			entityTransaction.commit();

		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
//		entityManager.clear();  it detaches all element
	}//end of main
}//end of ReAttached class
