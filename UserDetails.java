package com.mondee;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class UserDetails {
@Id
@Column(name="userid")
private int userid;
@Column(name="username")
private String username;

@OneToOne(fetch=FetchType.EAGER,targetEntity=UserDetails.class,cascade=CascadeType.ALL)

@JoinColumn(name="vehicleid",nullable=false)

private Vehicle obj;
public Vehicle getObj() {
	return obj;
}
public void setObj(Vehicle obj) {
	this.obj=obj;
}
public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}



}