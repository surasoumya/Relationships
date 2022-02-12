package com.mondee;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	private int personId;
	private String personName;
	
	
	private PersonDetails pDetails;
	
	
	@OneToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)//
	
	@JoinColumn(name="pDetaild_FK")//it is forienkey
	public PersonDetails getpDetails() {
		return pDetails;
	}
	public void setpDetails(PersonDetails pDetails) {
		this.pDetails = pDetails;
	}
	@Id
	//@GenerateValue       //auto generate the primary key
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	//private PersonDetails pDetails;
	
	
	
	
	
	
	

}
