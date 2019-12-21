package com.ustglobal.emailapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.emailapp.dao.RegisterDAO;
import com.ustglobal.emailapp.dto.User_Info;

@Service
public class RegisterServiceImpl implements RegisterService {
@Autowired
	private RegisterDAO dao;
	@Override
	public boolean registerUser(User_Info info) {
		return dao.registerUser(info);

	}

}
