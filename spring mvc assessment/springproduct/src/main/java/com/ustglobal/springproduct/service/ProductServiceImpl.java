package com.ustglobal.springproduct.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springproduct.beans.ProductBean;
import com.ustglobal.springproduct.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{
    
	@Autowired
	private ProductDAO dao;
	@Override
	public int createprofile(ProductBean bean) {
		return dao.createprofile(bean);
	}

	@Override
	public ProductBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public ProductBean searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
	return dao.changePassword(id, password);
	}

}
