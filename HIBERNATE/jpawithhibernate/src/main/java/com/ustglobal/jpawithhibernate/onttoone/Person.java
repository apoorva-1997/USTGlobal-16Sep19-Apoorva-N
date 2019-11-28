package com.ustglobal.jpawithhibernate.onttoone;

import javax.persistence.*;
import lombok.Data;				//instead of getter() & setter()

@Data				//Testonetoone
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
	private int pid;
	
	@Column
	private String pname;
	
	@OneToOne(cascade = CascadeType.ALL)		//one to one Unidirectional
	@JoinColumn(name="vid")
	private VoterCard voterCard;
	
	
}//end of Person
