package com.hib.projectwithmaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo {
	
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//get -> using student id
		//its return object and we know it's student obj so will typecast
		Student stud = (Student)session.get(Student.class, 106);
		
		System.out.println(stud);
		
		//Address: can also use load using same way
		Address ad= (Address)session.load(Address.class, 107);
		System.out.println(ad.getStreet());
		
		session.close();
		factory.close();
		
	}

}
