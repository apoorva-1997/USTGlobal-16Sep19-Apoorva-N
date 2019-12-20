package com.ustglobal.stockmanagment.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagment.dto.ProductResponse;
import com.ustglobal.stockmanagment.dto.Product_Info;
import com.ustglobal.stockmanagment.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")

@RestController
public class ProductController {

	@Autowired
	private ProductService service;


	@PostMapping(path="/add",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public  ProductResponse add(@RequestBody Product_Info product_info) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(product_info)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added to the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not added to the db");
		}
		return response;
	}
	
	@PutMapping(path="/modify",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyEmployee(@RequestBody Product_Info product_info) {
		ProductResponse response = new ProductResponse();
		if(service.updateProduct(product_info)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data modified in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not modified in the db");
		}
		return response;
	}

	@GetMapping(path="/get/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getname(@PathVariable("name")String name) {

		ProductResponse response = new ProductResponse();
		Product_Info product = service.getProductByName(name);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct_info(Arrays.asList(product));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/get/{company}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getcompany(@PathVariable("company")String company) {

		ProductResponse response = new ProductResponse();
		Product_Info product = service.getProductByCompany(company);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct_info(Arrays.asList(product));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
	
	@GetMapping(path="/get/{category}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getcategory(@PathVariable("category")String category) {

		ProductResponse response = new ProductResponse();
		List<Product_Info> product = service.getProductByCatagory(category);
		if(product!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data found in the db");
			response.setProduct_info(Arrays.asList());
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("data not found in the db");
		}
		return response;
	}
}
