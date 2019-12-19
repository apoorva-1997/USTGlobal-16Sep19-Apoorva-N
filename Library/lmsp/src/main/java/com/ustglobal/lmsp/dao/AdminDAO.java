package com.ustglobal.lmsp.dao;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;

public interface AdminDAO {
	public  boolean register(Admin adminbean);
	public Admin login(Admin adminbean);
}
