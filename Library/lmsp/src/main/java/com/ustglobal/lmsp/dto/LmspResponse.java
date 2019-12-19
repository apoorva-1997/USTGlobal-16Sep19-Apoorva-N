package com.ustglobal.lmsp.dto;

import java.util.List;

public class LmspResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<Book>  bookbeans;
	private List<Admin> adminbeans;
	private List<IssueBook> issuebook;

	
	public List<IssueBook> getIssuebook() {
		return issuebook;
	}
	public void setIssuebook(List<IssueBook> issuebook) {
		this.issuebook = issuebook;
	}
	public List<Admin> getAdminbeans() {
		return adminbeans;
	}
	public void setAdminbeans(List<Admin> adminbeans) {
		this.adminbeans = adminbeans;
	}
	public List<Book> getBookbeans() {
		return bookbeans;
	}
	public void setBookbeans(List<Book> bookbeans) {
		this.bookbeans = bookbeans;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
