package com.ustglobal.stockmanagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagment.dao.ProductDAO;
import com.ustglobal.stockmanagment.dto.Product_Info;

@Service
public class ServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(Product_Info product_info) {
		return dao.addProduct(product_info);
	}

	@Override
	public Product_Info getProductByName(String name) {
		return dao.getProductByName(name);
	}

	@Override
	public Product_Info getProductByCompany(String company) {
		return dao.getProductByCompany(company);
	}

	@Override
	public boolean updateProduct(Product_Info product_Info) {
		return dao.updateProduct(product_Info);
	}

	@Override
	public List<Product_Info> getProductByCatagory(String category) {
		return dao.getProductByCatagory(category);
	}

}
