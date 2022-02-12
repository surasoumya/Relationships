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

public class TestPerson {

	
		
	public static void main(String[] args, Session session) {
			
			StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
			Metadata me=new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf=me.getSessionFactoryBuilder().build();
			Session se=sf.openSession();
			Transaction tx=se.beginTransaction();
	
	      PersonDetails alexDetails=new PersonDetails();
	      alexDetails.setZipcode("442905");
	      alexDetails.setJob("Accountant");
	      alexDetails.setIncome(67345.56);
	      
	      Person alex= new Person();
	      alex.setPersonName("soumya");
	      alex.setPersonId(234);
	      
	     
	      session.save(alex); //no need of set cascadetype,
          session.getTransaction().commit();
	}
}
	      
	    
	      
	      
	      
        
	    
	

