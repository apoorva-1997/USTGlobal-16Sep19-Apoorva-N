package com.ustglobal.emailapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.emailapp.dto.Mail_Info;
import com.ustglobal.emailapp.dto.UserResponse;
import com.ustglobal.emailapp.dto.User_Info;
import com.ustglobal.emailapp.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	private RegisterService service;




	@PostMapping(path ="/register",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces =  MediaType.APPLICATION_JSON_VALUE)

	public UserResponse registerUser(@RequestBody User_Info info) {
		UserResponse response = new UserResponse();

		User_Info user = new User_Info();

		if(service.registerUser(info)) {
			response.setStatuscode(201);
			response.setMessage("success with registration");
			response.setDescription("registration success");


		}else if(info.getUser_name().isEmpty()){
			response.setStatuscode(401);
			response.setMessage("username is required");
			response.setDescription("registration failed");

					
		}
		else if(info.getPassword().length()<8){
			response.setStatuscode(402);
			response.setMessage("password should contain minimum 6 characters");
			response.setDescription("registration failed");
			
		} else if(user instanceof User_Info ) {
			response.setStatuscode(403);
			response.setMessage("you are already registered..please login");
			response.setDescription("registration failed");
		
		}
		else{
			response.setStatuscode(403);
			response.setMessage("failed");
			response.setDescription("registration failed");
		}
		return response;
}
}