package com.ustglobal.emailapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.emailapp.dto.Mail_Info;
import com.ustglobal.emailapp.dto.User_Info;
@Repository
public class MailDAOImpl implements MailDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean composeMail(Mail_Info mail, User_Info to_id, User_Info from_id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		mail.setUser(from_id);
		mail.setUserBean(to_id);
		//mail.setStatus("sent");
		transaction.begin();
		try {
			manager.persist(mail);
			transaction.commit();
			return true;
		} catch( Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteMail(int mid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		Mail_Info mail = manager.find(Mail_Info.class, mid);
		if(mail!=null) {
			manager.remove(mail);
			transaction.commit();
			return true;


		} else {
			return false;
		}
	}

	@Override
	public boolean draftMail(Mail_Info mail, User_Info to_id, User_Info from_id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		mail.setUser(from_id);
		mail.setUserBean(to_id);
		mail.setStatus("drafted");
		transaction.begin();
		try {
			manager.persist(mail);
			transaction.commit();
			return true;
		} catch( Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public List<Mail_Info> inbox() {
		String jpql = "from Mail_Info ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Mail_Info> query = manager.createQuery(jpql, Mail_Info.class);
		List<Mail_Info> mails = query.getResultList();
		return mails;
	}


}
