package com.ustglobal.springproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.ustglobal.springproduct.beans.ProductBean;

@Repository
public class ProductDAOImpl implements ProductDAO{
	@PersistenceUnit
	private EntityManagerFactory factory ;
	@Override
	public int createprofile(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch(Exception e) {
			e.printStackTrace();
			return 0;  						
		}
	}
	
	@Override
	
	public ProductBean login(int id, String password) {
		String jpql = "from ProductBean where id =:id and password = :password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductBean> query = manager.createQuery(jpql,ProductBean.class);
		query.setParameter("id", id);
		query.setParameter("password",password);
		try {
			
			ProductBean bean = query.getSingleResult();
			return bean; 
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}		
	}

	@Override
	public ProductBean searchProduct(int id) {
		EntityManager manager =factory.createEntityManager();
		return manager.find(ProductBean.class, id);
	}

	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductBean bean = manager.find(ProductBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	
	}

}
