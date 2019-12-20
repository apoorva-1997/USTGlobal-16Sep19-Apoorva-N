package com.ustglobal.stockmanagment.service;

import java.util.List;

import com.ustglobal.stockmanagment.dto.Product_Info;

public interface ProductService {

	public boolean addProduct(Product_Info product_info);
	public Product_Info getProductByName(String name);
	public List<Product_Info> getProductByCatagory(String category);
	public Product_Info getProductByCompany(String company);
	public boolean updateProduct(Product_Info product_Info);
}
