package com.ustglobal.lmsp.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.OrderBook;
@Repository
public class OrderDAOImpl implements OrderDAO {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean requestBook(int bid ,int id ) {
		
		OrderBook orderBook = new OrderBook();
		orderBook.setBid(bid);
		orderBook.setId(id);
		
		Date date = new Date();
		orderBook.setIssueDate(date);
		
//		Calendar c = Calendar.getInstance();
//		c.setTime(date);
//		c.add(Calendar.MONTH, 1);
//		Date returnDate = c.getTime();
//		orderBook.setReturnDate(returnDate);
//		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(orderBook);
		transaction.commit();
	
		manager.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean issueBook(int id, int bid) {
	
		return false;
	}


	
}
