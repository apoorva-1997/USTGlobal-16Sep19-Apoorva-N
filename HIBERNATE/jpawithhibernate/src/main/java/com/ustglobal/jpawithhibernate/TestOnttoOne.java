package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onttoone.Person;
import com.ustglobal.jpawithhibernate.onttoone.VoterCard;

//refer com.ustglobal.jpawithhibernate.onetoone package
public class TestOnttoOne {
	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Ram");
		
		Person person = new Person();
		person.setPid(2);
		person.setPname("Ram");
		person.setVoterCard(vc);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(person);			//one to one Unidirectional
			
//			VoterCard vc1 = entityManager.find(VoterCard.class, 10);  //one to one bidirectional
//			System.out.println(vc1.getPerson().getPid());
//			System.out.println(vc1.getPerson().getPname());
			
			System.out.println("Record Saved");
			entityTransaction.commit();
			
		} catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
	}
}
