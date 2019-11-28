package com.ustglobal.jpawithhibernateapp;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class TestManytoMany {
	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("Java");

		Course course2 = new Course();
		course2.setCid(20);
		course2.setCname("SQL");

		ArrayList<Course> ac = new ArrayList<Course>();
		ac.add(course1);
		ac.add(course2);

		Student student = new Student();
		student.setSid(1);
		student.setSname("Pooja");
		student.setCourse(ac);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(student);



			System.out.println("Record Saved");
			entityTransaction.commit();

		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}

		entityManager.close();
	}
}