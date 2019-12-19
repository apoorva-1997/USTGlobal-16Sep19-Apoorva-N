package com.ustglobal.lmsp.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lmsp.dto.Admin;
import com.ustglobal.lmsp.dto.Book;
import com.ustglobal.lmsp.dto.IssueBook;
import com.ustglobal.lmsp.dto.LmspResponse;
import com.ustglobal.lmsp.dto.OrderBook;
import com.ustglobal.lmsp.service.AdminService;
@CrossOrigin(origins = "*" , allowedHeaders = "*" ,allowCredentials = "true")
@RestController

public class AdminController {

	LmspResponse response = new LmspResponse();
	@Autowired
	private AdminService service;
	
	@PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse register(@RequestBody Admin adminbean) {		
		Admin admin = new Admin();
		if(service.register(adminbean)) {
				response.setStatusCode(201);
				response.setMessage("success with registration");
				response.setDescription("registration success");

			}else if(adminbean.getUsername().isEmpty()){
				response.setStatusCode(401);
				response.setMessage("username is required");
				response.setDescription("registration failed");

						
			}
			else if(adminbean.getPassword().length()<6){
				response.setStatusCode(402);
				response.setMessage("password should contain minimum 6 characters");
				response.setDescription("registration failed");
				
			} else if(admin instanceof Admin ) {
				response.setStatusCode(403);
				response.setMessage("you are already registered..please login");
				response.setDescription("registration failed");
			
			}
			else{
				response.setStatusCode(403);
				response.setMessage("failed");
				response.setDescription("registration failed");
			}
		
		
		return response;
	}
	
	@PostMapping(path="/login" ,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse login(@RequestBody Admin adminbean) {
		Admin admin = service.login(adminbean);
		if(admin == null) {
			
			response.setStatusCode(401);
			response.setMessage("user not found.please register");
			response.setDescription("login failed");
			
		}else {
			response.setStatusCode(201);   
			response.setMessage("Login succesful");
			response.setDescription("Login success");
			response.setAdminbeans(Arrays.asList(admin));
			
		}
		
		return response;
		
	}//end of login
	
	@PostMapping(path="/add" , consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse addBook(@RequestBody Book book) {
			if(service.addBook(book)) {
				response.setStatusCode(201);   //if insertion is success
				response.setMessage("Success");
				response.setDescription("book succesfully added to db");
			}else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Failed to add book to db");
			}
			return response;
		}//end of addBook
	
	@GetMapping(path="/search/{bid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse searchBook(@PathVariable("bid")int bid) {
			Book book = service.searchBook(bid);
			if(book != null) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Book found in db");
				response.setBookbeans(Arrays.asList(book));	
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Book not found in db");
			}
			return response;
	}
	
	@PostMapping(path="/issue" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse issueBook(@RequestBody IssueBook orderbook1) {
			if(service.issueBook(orderbook1)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("book issued");
				response.setIssuebook(Arrays.asList(orderbook1));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Data not found in db");
			}
			return response;
	}
	
	@PostMapping(path="/requestbook/{bid}/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse requestBook(@PathVariable("bid")int bid , @PathVariable("id")int id) {
		
		if(service.requestBook(bid ,id)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("requested");
		
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to add book to db");
		}
		return response;
	}
	
	@DeleteMapping(path="/return/{id}/{bid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse returnBook(@PathVariable("id")int id ,@PathVariable("bid")int bid) {
		if(service.returnBook(id,bid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("book deleted succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to delete the data");
		}
		return response;
	}//end of deleteBook
		
	@DeleteMapping(path="/delete/{bid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse deleteBook(@PathVariable("bid")int bid) {
		if(service.deleteBook(bid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("book deleted succesfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Failed to delete the data");
		}
		return response;
	}//end of deleteBook
	
	@GetMapping(path="/get-all" , produces = MediaType.APPLICATION_JSON_VALUE)
	public LmspResponse getAllEmployee(){
		List<Book> bean = service.getAllBook();
		
		if(bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Book found in db");
			response.setBookbeans(bean);
			} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book not found in db");
		}
		return response;
	}//end of getAllBook
}




