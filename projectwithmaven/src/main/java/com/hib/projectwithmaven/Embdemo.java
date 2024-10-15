package com.hib.projectwithmaven;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embdemo {
	
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		//Session session = factory.openSession();
		
		Student stud1 = new Student();
		stud1.setId(190);
		stud1.setName("oosa");
		stud1.setCity("delhhi");
		
		Certificate certif = new Certificate();
		certif.setCourse("Java");
		certif.setDuration("2months");
		
		stud1.setCerti(certif);
		
		Session s = factory.openSession();
		Transaction tx= s.beginTransaction();
		
		//object save
		s.save(stud1);
		
		
		
		
		
		factory.close();
		
	}

}
