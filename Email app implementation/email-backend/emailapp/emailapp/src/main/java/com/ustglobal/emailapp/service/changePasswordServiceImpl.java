
package com.ustglobal.emailapp.service;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.ustglobal.emailapp.dao.ChangePassword;

@Service
public class changePasswordServiceImpl implements ChangePasswordService{

	@Autowired
	private ChangePassword dao;

	@Override
	public boolean changepassword(String email, String password) { 

		return dao.changepassword(email, password);
	}
}