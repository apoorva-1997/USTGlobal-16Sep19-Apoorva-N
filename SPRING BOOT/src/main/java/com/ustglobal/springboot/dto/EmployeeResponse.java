package com.ustglobal.springboot.dto;

import java.util.List;

public class EmployeeResponse {
	
	private int statusCode;
	private String meaasage;
	private String description;
	private List<EmployeeBean>employeeBeans;  
	
	public List<EmployeeBean> getEmployeeBeans() {
		return employeeBeans;
	}
	public void setEmployeeBeans(List<EmployeeBean> employeeBeans) {
		this.employeeBeans = employeeBeans;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMeaasage() {
		return meaasage;
	}
	public void setMeaasage(String meaasage) {
		this.meaasage = meaasage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
