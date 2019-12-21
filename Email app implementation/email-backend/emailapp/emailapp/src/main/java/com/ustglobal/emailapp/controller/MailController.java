package com.ustglobal.emailapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.emailapp.dto.Mail_Info;
import com.ustglobal.emailapp.dto.UserResponse;
import com.ustglobal.emailapp.dto.User_Info;
import com.ustglobal.emailapp.service.MailService;

@RestController
public class MailController {
	
	@Autowired
	private MailService service;
	
	@PostMapping(path="/compose", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse composeMail(@RequestBody Mail_Info mail,@RequestBody User_Info to_id,@RequestBody User_Info from_id) {
		UserResponse response = new UserResponse();
		//boolean info = service.composeMail(mail, to_id, from_id);
		if(service.composeMail(mail, to_id, from_id)) {
			response.setStatuscode(201);
			response.setMessage("success with registration");
			response.setDescription("registration success");

		}else{
			response.setStatuscode(403);
			response.setMessage("failed");
			response.setDescription("registration failed");
		}


		return response;
		
	}
	@DeleteMapping(path="/deleteMail/{mid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse deleteMail(@PathVariable("mid") int mid) {
		UserResponse response = new UserResponse();
		boolean info =service.deleteMail(mid);
		if(info) {
			response.setStatuscode(201);
			response.setMessage(" mail has been deleted ");
			response.setDescription("success");

		}else{
			response.setStatuscode(501);
			response.setMessage("failed");
			response.setDescription(" failed");
		}


		return response;
	}
	
	@PostMapping(path="/draftMail", consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public UserResponse draftMail(@RequestBody Mail_Info mail,@RequestBody User_Info to_id,@RequestBody User_Info from_id) {
		UserResponse response = new UserResponse();
		//boolean info =service.draftMail(mail, to_id, from_id);
		if(service.draftMail(mail, to_id, from_id)) {
			response.setStatuscode(201);
			response.setMessage("added to draft");
			response.setDescription(" success");

		}else{
			response.setStatuscode(501);
			response.setMessage("Not Added to draft");
			response.setDescription("failed");
		}


		return response;
	}
	@GetMapping(path="/inbox", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse inbox(){
		UserResponse response = new UserResponse();
		List<Mail_Info> mails = service.inbox();
		if(mails!=null) {
			response.setStatuscode(201);
			response.setMessage("Mails found");
			response.setDescription(" success");
			response.getMail();

		}else{
			response.setStatuscode(501);
			response.setMessage("Try again");
			response.setDescription(" failed");
		}


		return response;
	}

}
