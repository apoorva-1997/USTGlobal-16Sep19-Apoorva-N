package com.ustglobal.stockmanagment.dto;

import java.util.List;

public class ProductResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<Product_Info>product_info; 
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product_Info> getProduct_info() {
		return product_info;
	}
	public void setProduct_info(List<Product_Info> product_info) {
		this.product_info = product_info;
	}
	
	
}
