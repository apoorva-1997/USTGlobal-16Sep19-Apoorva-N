package com.ustglobal.crudoperations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.crudoperations.dto.Employee;


public class SelectOprn {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class,3);
		System.out.println("Id is "+employee.getId());
		System.out.println("Name is "+employee.getName());
		System.out.println("Quantity is "+employee.getSalary());
		entityManager.close();
	}

}
