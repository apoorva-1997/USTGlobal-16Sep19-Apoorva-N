package com.ustglobal.jpawithhibernate.jpq;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class DispNames {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql ="select pname from Product";
		Query qry = entityManager.createQuery(jpql);

		List<String> b = qry.getResultList(); 								/* prints names only */ 
		for(String product : b ) {
			System.out.println(product);
		}
	}
}
