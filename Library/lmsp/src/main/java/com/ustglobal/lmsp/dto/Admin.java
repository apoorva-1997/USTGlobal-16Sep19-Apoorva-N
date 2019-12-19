package com.ustglobal.lmsp.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.sun.istack.NotNull;

@Entity
@Table(name="user")
public class Admin  {

	private static String message;
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
//	@NotEmpty(message="username should not be empty")
	private String username;
	@Column(unique = true , nullable = false)
	@NotNull
	private String email;
	@Column
	private String password;
	@Column
	private String role;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_book",joinColumns = @JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name="bid"))
	private List<Book> book;
	

}
