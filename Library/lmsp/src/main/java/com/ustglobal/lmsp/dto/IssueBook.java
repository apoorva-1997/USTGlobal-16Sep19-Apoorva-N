package com.ustglobal.lmsp.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="issuebook")
public class IssueBook {

	@Id
	@GeneratedValue
	@Column
	private int isid;
	@Column
	private int bid;
	@Column
	private int id;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date issueDate;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date returndate;
	public int getIsid() {
		return isid;
	}
	public void setIsid(int isid) {
		this.isid = isid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	
	
}
