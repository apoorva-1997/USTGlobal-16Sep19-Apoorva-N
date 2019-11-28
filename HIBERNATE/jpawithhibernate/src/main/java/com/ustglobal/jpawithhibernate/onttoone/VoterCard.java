package com.ustglobal.jpawithhibernate.onttoone;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;		//instead of getter() & setter()
						//Testonetoone
@Data	
@Entity
@Table(name="votercard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	
	@Column
	private String vname;
	
	@OneToOne(mappedBy="voterCard")		//OneToOne Bidirectional
	@Exclude
	private Person person;
}//end of VoterCard
