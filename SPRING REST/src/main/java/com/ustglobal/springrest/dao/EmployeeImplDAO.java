package com.ustglobal.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springrest.dto.EmployeeBean;
@Repository
public class EmployeeImplDAO implements EmployeeDAO{
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
		transaction.begin();
		manager.persist(bean);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}//end of addEmployee

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean employeeBean = manager.find(EmployeeBean.class, bean.getId());
		employeeBean.setName(bean.getName());
		employeeBean.setPassword(bean.getPassword());
		employeeBean.setGender(bean.getGender());
		employeeBean.setDoj(bean.getDoj());
		transaction.commit();
		return true;
	}//end ofmodifyEmployee

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		if(bean != null) {
		manager.remove(bean);
		transaction.commit();
		return true;
		} else {
			return false;
		}
	}//end of deleteEmployee

	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		return bean;
	}//end of getEmployee

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql = "from EmployeeBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql, EmployeeBean.class);
		List<EmployeeBean> employeeBeans = query.getResultList();
		return employeeBeans;
	}//end of getAllEmployee

	
}//end of EmployeeImplDAO
