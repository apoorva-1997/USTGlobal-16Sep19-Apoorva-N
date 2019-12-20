package com.ustglobal.stockmanagment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.stockmanagment.dto.ProductResponse;

@RestControllerAdvice
public class HandlerException {
	
	@ExceptionHandler(Exception.class)
	public ProductResponse getException() {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("error in the code");
		response.setDescription("got an exception");
		return response;
	}
}
