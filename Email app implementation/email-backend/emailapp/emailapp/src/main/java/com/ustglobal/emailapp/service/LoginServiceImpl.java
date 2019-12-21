package com.ustglobal.emailapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.emailapp.dao.LoginDAO;
import com.ustglobal.emailapp.dto.User_Info;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO logindao;

	@Override
	public User_Info login(String email, String password) {
	
		return logindao.login(email, password);
				
	}
}
