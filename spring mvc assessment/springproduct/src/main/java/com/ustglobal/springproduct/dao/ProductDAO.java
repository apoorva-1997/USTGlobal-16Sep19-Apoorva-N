package com.ustglobal.springproduct.dao;

import com.ustglobal.springproduct.beans.ProductBean;

public interface ProductDAO {
	
	public int createprofile(ProductBean bean);
	public ProductBean login(int id,String password);
	public ProductBean searchProduct(int id);
	public boolean changePassword(int id,String password);
}
