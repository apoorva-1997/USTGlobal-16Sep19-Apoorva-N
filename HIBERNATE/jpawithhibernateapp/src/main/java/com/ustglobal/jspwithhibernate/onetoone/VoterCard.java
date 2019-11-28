package com.ustglobal.jspwithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity

@Table(name="votercaerd")
public class VoterCard {
	
	@Id
	@Column
	private int vid;
	@Column
	private String name;
	@OneToOne(mappedBy = "voterCard")								//bidirectional
	@Exclude														//to exclude toString
	private Person person;
	
}
