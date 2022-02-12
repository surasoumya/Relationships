package com.mondee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PersonDetails {


	private int PersonDetailId;
	private String zipcode;
	private  String job;
	private double income;
	
	
	
   @Id
   @Column(name="details_FK")
	public int getPersonDetailId() {
		return PersonDetailId;
	}
	public void setPersonDetailId(int personDetailId) {
		PersonDetailId = personDetailId;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
}
