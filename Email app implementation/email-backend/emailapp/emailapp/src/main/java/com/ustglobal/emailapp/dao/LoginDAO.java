package com.ustglobal.emailapp.dao;

import com.ustglobal.emailapp.dto.User_Info;

public interface LoginDAO {
	
	public User_Info login(String email, String password);
	

}
