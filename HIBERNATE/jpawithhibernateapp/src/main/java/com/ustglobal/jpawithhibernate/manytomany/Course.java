package com.ustglobal.jpawithhibernate.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="course")
@Data
public class Course {
	
	@Column
	@Id
	private int cid;
	
	@Column
	private String cname;
//	@Exclude															//bidirectional
//	@ManytoMany(cascade= CascadeType.ALL,mappedBy="course")
//	private List<Student> student;
}
