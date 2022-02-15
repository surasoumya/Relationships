package com.mondee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Mainlogic {

	public static void main(String[] args) {

		Session se = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = se.beginTransaction();
		
		Students student=new Students();
		student.setStudentId(1);
		student.setStudentName("soumya");
		
		Students student1=new Students();
		student1.setStudentId(2);
		student1.setStudentName("salomi");
		
		Students student2=new Students();
		student2.setStudentId(3);
		student2.setStudentName("kalpana");
		
		Set students=new HashSet();
		students.add(student);
		students.add(student1);
		students.add(student2);
		
		Branch branch = new Branch();
		branch.setBranchId(5);
		branch.setBranchName("CSE");

		Branch branch1 = new Branch();
		branch1.setBranchId(4);
		branch1.setBranchName("ECE");
		
		Set branches = new HashSet();
		branches.add(branch);
		branches.add(branch1);

		student1.setBranches(branches);
		student.setBranches(branches);
		branch.setStudents(students);
		branch1.setStudents(students);
		se.save(branch);
		se.save(branch1);
		se.save(student);
		
		tx.commit();
		se.close();
		
		

	}
}