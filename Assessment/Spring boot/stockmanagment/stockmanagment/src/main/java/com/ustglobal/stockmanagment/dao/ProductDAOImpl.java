package com.ustglobal.stockmanagment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagment.dto.Product_Info;

@CrossOrigin(origins = "*" , allowedHeaders = "*" , allowCredentials = "true")

@RestController
public class ProductDAOImpl implements ProductDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(Product_Info product_info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product_info);
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Product_Info getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product_Info where name=:name";
			TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
			typedQuery.setParameter("name", name);
			Product_Info product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}


	@Override
	public List<Product_Info> getProductByCatagory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where category=:category";
		TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public Product_Info getProductByCompany(String company) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product_Info where company=:company";
			TypedQuery<Product_Info> typedQuery = manager.createQuery(jpql, Product_Info.class);
			typedQuery.setParameter("company", company);
			Product_Info product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean updateProduct(Product_Info product_Info) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product_Info p = manager.find(Product_Info.class, product_Info.getId());
			p.setCategory(product_Info.getCategory());
			p.setName(product_Info.getName());
			p.setQuantity(product_Info.getQuantity());
			p.setPrice(product_Info.getPrice());
			p.setCompany(product_Info.getCompany());
			transaction.commit();
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean doOrder(int id, int quantity, int oid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double totalAmount(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
