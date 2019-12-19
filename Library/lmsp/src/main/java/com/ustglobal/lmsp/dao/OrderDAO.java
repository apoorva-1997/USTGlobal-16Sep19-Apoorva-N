package com.ustglobal.lmsp.dao;

import java.util.List;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.OrderBook;

public interface OrderDAO {

	public boolean requestBook(int bid , int id );
	public boolean issueBook(int bid , int id);
}
