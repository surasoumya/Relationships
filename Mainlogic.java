package com.mondee;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class Mainlogic {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		 Student sai =new Student();
		sai.setSid(5);
		sai.setSname("naresh");
		sai.setSmarks(499);
		
		session.save(sai); 
		
		// ALL RECORDS DISPLAY
		
	/*	Query qr = session.createQuery("from Student s");
		
		List studentsList = qr.list();
		Iterator itr = studentsList.iterator();

		while(itr.hasNext()) {
			Student x = (Student) itr.next();
			System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks());
		} */
		
		//PATICULAR RECORDS DISPLAY
		
		/* Query qr = session.createQuery(" from Student s where s.sid=:x");
		qr.setParameter("x",5);
		List studentsList = qr.list();
		Iterator itr = studentsList.iterator();

		while(itr.hasNext()) {
			Student x = (Student) itr.next();
			System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks());
		} */

		//Query qr = session.createQuery("delete from Student s where s.sid =:p");
		//qr.setParameter("p",3);
		
		// UPDATE RECORDS DISPLAY
		/* Query qr = session.createQuery(" update Student set sname=: sname where sid=:sid");
		qr.setParameter("sname","prasanna");
		qr.setParameter("sid", 1);
		int re = qr.executeUpdate();
		System.out.println(re); 
		
		*/
		t.commit();
		session.close();
	}
}