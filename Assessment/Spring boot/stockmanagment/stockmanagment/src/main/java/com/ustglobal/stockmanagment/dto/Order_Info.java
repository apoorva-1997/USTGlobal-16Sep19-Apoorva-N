package com.ustglobal.stockmanagment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_info")
public class Order_Info {
	
	@Id
	@GeneratedValue
	@Column
	private int oid;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}
	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	private Product_Info product_info;

	public Product_Info getProduct_info() {
		return product_info;
	}
	public void setProduct_info(Product_Info product_info) {
		this.product_info = product_info;
	}
	
}
