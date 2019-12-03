package com.ustglobal.springproduct.service;

import com.ustglobal.springproduct.beans.ProductBean;

public interface ProductService {
	
	public int createprofile(ProductBean bean);
	public ProductBean login(int id,String password);
	public ProductBean searchProduct(int id);
	public boolean changePassword(int id,String password);
	

}
