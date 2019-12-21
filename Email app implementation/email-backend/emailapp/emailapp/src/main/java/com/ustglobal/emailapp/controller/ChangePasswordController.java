package com.ustglobal.emailapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.emailapp.dto.UserResponse;
import com.ustglobal.emailapp.service.ChangePasswordService;

@RestController
public class ChangePasswordController {
	@Autowired
	private  ChangePasswordService changeService;
	
	@PutMapping(path="/change" ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse changepassword(@RequestParam("email")String email, @RequestParam("password")  String password) {
		UserResponse response = new UserResponse();
		boolean user = changeService.changepassword(email, password);
		if(user) {
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
	
	


