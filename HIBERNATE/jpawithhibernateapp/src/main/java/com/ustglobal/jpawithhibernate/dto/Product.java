package com.ustglobal.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Generated;

@Entity 														/* to create entity class */
@Table(name = "product") 										/* to map class to table */
public class Product {
	@Id 														/* to convert data member as PK */
	@GeneratedValue(strategy = GenerationType.AUTO)             //autoupdate
	@Column														/*to add values into particular column*/
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
