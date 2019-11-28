package com.ustglobal.jpawithhibernate.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="course")
public class Course {

	@Id
	@Column
	private int cid;
	
	@Column
	private String cname;
	
}
