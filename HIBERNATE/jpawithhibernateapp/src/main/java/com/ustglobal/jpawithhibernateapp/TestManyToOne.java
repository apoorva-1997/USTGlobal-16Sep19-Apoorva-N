package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytoone.Pencil;
import com.ustglobal.jpawithhibernate.manytoone.PencilBox;

public class TestManyToOne {

	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(10);
		pb.setBname("Apsara");

		Pencil p = new Pencil();
		p.setColor("Black");
		p.setPid(11);
		p.setPencilbox(pb);

		Pencil p1 = new Pencil();
		p1.setColor("Blue");
		p1.setPid(12);
		p1.setPencilbox(pb);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			PencilBox pencilbox = entityManager.find(PencilBox.class, 10);
			
			System.out.println(pencilbox.getPencil().get(0));			//0 index value
			System.out.println(pencilbox.getPencil().get(1));
//			entityManager.persist(p);
//			entityManager.persist(p1);

			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 		
		entityManager.close();
	}
}

