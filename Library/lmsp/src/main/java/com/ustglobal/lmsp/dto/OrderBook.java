package com.ustglobal.lmsp.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="user_detail")
public class OrderBook {
	@GeneratedValue
	@Id
	@Column
	private int isid;
	@Column
	private int id;
	@Column
	private int bid;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date issueDate;
	public int getIsid() {
		return isid;
	}
	public void setIsid(int isid) {
		this.isid = isid;
	}
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date returnDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
