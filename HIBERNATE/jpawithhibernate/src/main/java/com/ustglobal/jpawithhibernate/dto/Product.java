package com.ustglobal.jpawithhibernate.dto;

import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Entity							//To create Entity class
@Table(name="product")			//To Connect with respective table
public class Product {

	@Id							//To make the data as primary key
	@Column						//To insert data into respective column
	private int pid;
	
	@Column
	private String pname;
	
	@Column
	private int quantity;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
