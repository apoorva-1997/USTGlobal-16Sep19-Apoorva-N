package com.ustglobal.emailapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Entity
@Table(name="Mail_Info")
public class Mail_Info {
	@Id
	@Column
	@GeneratedValue
	private int mid;

	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "from_id")
	private User_Info user;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "to_id")
	private User_Info userBean;

}
