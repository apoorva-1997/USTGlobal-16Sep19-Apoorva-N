package com.ustglobal.emailapp.service;

import com.ustglobal.emailapp.dto.User_Info;

public interface LoginService {
	
	public User_Info login(String email, String password);
}
