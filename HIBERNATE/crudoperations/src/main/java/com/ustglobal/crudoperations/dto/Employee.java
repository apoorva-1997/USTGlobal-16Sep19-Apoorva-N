package com.ustglobal.crudoperations.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 														/* to create entity class */
@Table(name = "employee") 
public class Employee {
	@Id 														/* to convert data member as PK */
	@Column	
	private int id;
	@Column
	private String name;
	@Column
	private double salary;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


}
