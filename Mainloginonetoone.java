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


public class Mainloginonetoone {

	public static void main(String[] args) {

		Session se = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = se.beginTransaction();
		
		
		Vehicle vehicle = new Vehicle(); 
		vehicle.setVehiclename("audi");
		vehicle.setVehicleid(102);
		
		UserDetails user=new UserDetails();
		user.setUserid(2);
		user.setUsername("lucky");
		user.setObj(vehicle);
		
	
		
		se.save(vehicle);
		se.save(user);
		
		tx.commit();
		se.close();
		
		

	}
}
