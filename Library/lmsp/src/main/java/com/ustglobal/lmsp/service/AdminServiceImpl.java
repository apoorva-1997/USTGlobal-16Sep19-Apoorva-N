package com.ustglobal.lmsp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import com.ustglobal.lmsp.dao.AdminDAO;
import com.ustglobal.lmsp.dao.LibrarianDAO;
import com.ustglobal.lmsp.dao.OrderDAO;
import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.IssueBook;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	@Autowired
	private LibrarianDAO dao1;
	@Autowired
	private OrderDAO dao2;
	
	@Override
	public boolean register(Admin adminbean) {
		if(adminbean.getUsername()==null || adminbean.getPassword()==null) {
			return false;
		}else if (adminbean.getPassword().length() < 6) {
			return false;
		}else {
		return dao.register(adminbean);
		}
	}

	@Override
	public boolean returnBook(int id , int bid) {
		return dao1.returnBook(id , bid);
	}


	@Override
	public Admin login(Admin adminbean) {
		if(adminbean.getPassword()==null) {
			return null;
		}
		return dao.login(adminbean);
	}


	@Override
	public boolean addBook(Book book) {
		return dao1.addBook(book);
	}

	@Override
	public Book searchBook(int bid ) {
		return dao1.searchBook(bid);
	}

	
	@Override
	public boolean deleteBook(int bid) {
		return dao1.deleteBook(bid);
	}

	@Override
	public List<Book> getAllBook() {
		return dao1.getAllBook();
	}

	@Override
	public boolean requestBook(int bid , int id ) {
		return dao2.requestBook(bid , id );
	}

	@Override
	public boolean isAlreadyPresent(Admin adminbean) {
		return false;
	}

	@Override
	public boolean userNameEmpty(Admin adminbean) {
		Admin admin  = new Admin();
		if(adminbean.getEmail()==admin.getEmail()) {
		return false;
	}else {
		return true;
	}
	}

	@Override
	public boolean issueBook(IssueBook orderbook1) {
		return dao1.issueBook(orderbook1);
	}
}
		

	

	

	

	


