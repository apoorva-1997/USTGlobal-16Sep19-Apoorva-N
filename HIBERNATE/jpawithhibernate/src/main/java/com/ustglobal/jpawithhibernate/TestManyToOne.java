package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomanyormanytoone.Pencil;
import com.ustglobal.jpawithhibernate.onetomanyormanytoone.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Camelin");
		
		Pencil p = new Pencil();
		p.setPid(1);
		p.setColor("black");
		p.setPencilbox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(2);
		p1.setColor("black");
		p1.setPencilbox(pb);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
//			entityManager.persist(p);
//			entityManager.persist(p1);
			
			PencilBox pb1 = entityManager.find(PencilBox.class, 1);
			System.out.println(pb1.getPencil().get(0));
			System.out.println(pb1.getPencil().get(1));

			System.out.println("Record Saved");
			entityTransaction.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
	}
}
