package com.mondee;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	@Column(name="branchid")
	private int branchId;

	@Column(name="branchname")
	private String branchName;

	@ManyToMany(fetch=FetchType.LAZY,targetEntity = Students.class,cascade = CascadeType.ALL)
	@JoinTable(name="student_branch",joinColumns=@JoinColumn(name="bid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private Set<Students> students;

	public Set<Students> getStudents() {
		return students;
	}

	public void setStudents(Set<Students> students) {
		this.students = students;
	}
	
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	
}