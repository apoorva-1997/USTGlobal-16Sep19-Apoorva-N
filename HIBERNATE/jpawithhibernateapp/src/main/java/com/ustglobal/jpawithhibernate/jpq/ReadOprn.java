package com.ustglobal.jpawithhibernate.jpq;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadOprn {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	String jpql ="from Product";
	Query qry = entityManager.createQuery(jpql);
	
	List<Product> a = qry.getResultList();
	for(Product product : a) {
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity());
	}

}
}
