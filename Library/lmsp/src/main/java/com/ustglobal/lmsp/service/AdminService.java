package com.ustglobal.lmsp.service;

import java.util.List;
import com.ustglobal.lmsp.dto.Admin;

import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.IssueBook;

public interface AdminService {
	public  boolean register(Admin adminbean);
	public boolean isAlreadyPresent(Admin adminbean);
	public Admin login(Admin adminbean);
	public boolean addBook(Book book);
	public boolean deleteBook(int bid);
	public Book searchBook(int bid );
	public boolean issueBook(IssueBook orderbook1);
	public boolean returnBook(int id , int bid);
	public List<Book> getAllBook();
	boolean userNameEmpty(Admin adminbean);
	public boolean requestBook(int bid ,int id );
}
