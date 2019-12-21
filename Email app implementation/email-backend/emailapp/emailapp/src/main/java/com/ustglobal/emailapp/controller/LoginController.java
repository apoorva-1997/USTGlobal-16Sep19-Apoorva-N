package com.ustglobal.emailapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.emailapp.dto.UserResponse;
import com.ustglobal.emailapp.dto.User_Info;
import com.ustglobal.emailapp.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	
	
	@PostMapping(path ="/login")
	public  UserResponse login(@RequestBody User_Info user) {
		UserResponse response = new UserResponse();
		User_Info info = loginService.login(user.getEmail(),user.getPassword());
		if(info!=null) {
			response.setStatuscode(201);
			response.setMessage("Login Successful !!!!!!");
			response.setDescription("Success");
		}else {
			response.setStatuscode(401);
			response.setMessage("Invalid Credential");
			response.setDescription("Failure");
		}
		return response;
	}
	

}
