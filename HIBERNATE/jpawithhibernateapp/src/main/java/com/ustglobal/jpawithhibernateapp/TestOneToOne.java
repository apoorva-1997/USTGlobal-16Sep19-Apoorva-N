package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jspwithhibernate.onetoone.Person;
import com.ustglobal.jspwithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setName("Apooo");
		Person person = new Person();
		person.setPid(1);
		person.setName("Ram");
		person.setVoterCard(vc);
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class, 10);		//bidirectional
			System.out.println(vCard.getPerson().getPid());					//bidirectional
			System.out.println(vCard.getPerson().getName());				//bidirectional
			/*
			 * entityManager.persist(person); 							//unidirectional
			 */			
			System.out.println("Record Saved");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} 								
		entityManager.close();
	}
}

