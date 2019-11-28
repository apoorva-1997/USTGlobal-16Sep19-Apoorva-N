package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String jpql = "insert into product values pid=103 pname = 'Book'quantity=20";
		Query query = entityManager.createQuery(jpql);
		
		List<Product> list =  query.getResultList();
		
		for(Product product : list) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			System.out.println("=======================");
		}
		
		entityManager.close();
		
	}//end of main
}//end of InsertDemo