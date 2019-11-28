package com.ustglobal.crudoperations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.crudoperations.dto.Employee;

public class InsertOprn {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("apooo");
		employee.setSalary(10);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		
		System.out.println("Record Saved");
		entityTransaction.commit(); 								
		entityManager.close();
	}
}
