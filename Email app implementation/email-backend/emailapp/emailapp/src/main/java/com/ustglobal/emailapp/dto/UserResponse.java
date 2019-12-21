package com.ustglobal.emailapp.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserResponse {
	
	private int statuscode;
	private String message;
	private String description;
	
	private List<User_Info> user;
	private List<Mail_Info> mail;
	

}
