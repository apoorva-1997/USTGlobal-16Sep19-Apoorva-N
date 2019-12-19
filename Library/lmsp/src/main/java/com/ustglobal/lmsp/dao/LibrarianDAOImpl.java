package com.ustglobal.lmsp.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.IssueBook;
import com.ustglobal.lmsp.dto.OrderBook;
@Repository
public class LibrarianDAOImpl implements LibrarianDAO {

	
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addBook(Book book) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(book);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Book searchBook(int bid ) {
		EntityManager manager = factory.createEntityManager();
		Book book = manager.find(Book.class, bid);
		return book;
	}

	@Override
	public boolean deleteBook(int bid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Book book = manager.find(Book.class, bid);
		if(book != null) {
			manager.remove(book);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Book> getAllBook() {
		String jpql = "from Book";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Book> query = manager.createQuery(jpql, Book.class);
		List<Book> bookbeans = query.getResultList();
		return bookbeans;
	}

	@Override
	public boolean issueBook(IssueBook orderbook) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(orderbook);
		orderbook.setIssueDate(new Date());
		transaction.commit();
		manager.close();
		return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean returnBook(int id, int bid) {
		
		IssueBook ib = new IssueBook();
		Date date = new Date();
		ib.setReturndate(date);
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		IssueBook book = manager.find(IssueBook.class, id);
		if(book != null) {
			manager.remove(book);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

	


}
