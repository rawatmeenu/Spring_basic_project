package com.hib.projectwithmaven.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.projectwithmaven.Certificate;
import com.hib.projectwithmaven.Student;

public class Statedemo {
	
	public static void main(String args[])
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Student s1 = new Student();
		s1.setCity("grid");
		s1.setName("gyee");
		s1.setCerti(new Certificate("java hibernate course", "bcfibws"));
		//student : TRnasient
		//can change value in db 
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(s1);
		
		//student: persistent
		tx.commit();
		
		s.close();
		s1.setName("bdiubws"); // not updtae in DB. DETACHED
	
		
		sf.close();
		
	}
	

}
