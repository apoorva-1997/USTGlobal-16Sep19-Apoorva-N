package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadName {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	String jpql = "select pname from Product";
	Query query = entityManager.createQuery(jpql);
	
	List<String> product = query.getResultList();
	
	for(String name : product ) {
		System.out.println(name);
	}
	
	
	
	
	
	entityManager.close();
	
}
}
