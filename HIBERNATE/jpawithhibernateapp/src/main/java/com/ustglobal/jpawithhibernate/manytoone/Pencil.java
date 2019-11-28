package com.ustglobal.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="pencil")

public class Pencil {
	@Id
	@Column
	private int pid;
	
	@Column
	private String color;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bid", nullable=false)				//fk of PencilBox must not be null
	private PencilBox pencilbox;
}
