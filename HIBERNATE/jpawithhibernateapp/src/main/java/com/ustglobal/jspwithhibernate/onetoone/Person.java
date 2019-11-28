package com.ustglobal.jspwithhibernate.onetoone;												//source entity

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="person")
public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)								//used for unidirectional
	@JoinColumn(name="vid")											//to combine pk and fk
	private VoterCard voterCard;
	
}
