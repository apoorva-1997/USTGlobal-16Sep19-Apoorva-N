package com.ustglobal.lmsp.dao;

import java.util.List;

import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.IssueBook;
import com.ustglobal.lmsp.dto.OrderBook;

public interface LibrarianDAO {
	public boolean addBook(Book book);
	public Book searchBook(int bid);
	public boolean deleteBook(int bid);
	public boolean issueBook(IssueBook orderbook1);
	public boolean returnBook(int id, int bid);
	public List<Book> getAllBook();

}
