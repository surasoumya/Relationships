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

public class MainLogic {
	
public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
		Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=me.getSessionFactoryBuilder().build();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Vendor v=new Vendor();//inserting the record
	    v.setVendorId(102);
	    v.setVendorName("Amazon");
	                                 //inserting the record
         v.setVendorName("Amazon");
	    
	    
	    Customers  c1=new Customers() ;       //specifing the customers(2 customers)
	    c1.setCustomerId(201);
	    c1.setCustomerName("soumya");
	    
	    
	    Customers  c2=new Customers() ;       //specifing the customers
	    c2.setCustomerId(202);
	    c2.setCustomerName("salomi");
	    
	    
	         Set s=new HashSet() ; //create set object
	         s.add(c1);
	         s.add(c2);
	    
	         v.setObj(s);
	         
	         
	         se.save(v);
	         tx.commit();
	         
	    
}
}
