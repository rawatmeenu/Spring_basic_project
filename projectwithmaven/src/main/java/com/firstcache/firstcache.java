package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hib.projectwithmaven.Student;

public class firstcache {
	
	public static void main(String[] args) {
		
		SessionFactory fact = new Configuration().configure().buildSessionFactory();
		Session s = fact.openSession();
		
		//budefault enabled
	Student s1 = (Student) s.get(Student.class, 1242);
	System.out.println(s1);
	
	Student s2 = (Student) s.get(Student.class, 1242);
	System.out.println(s2);
	
	System.out.println(s.contains(s1));  // print true if object is already there in cache or not
		
		
		fact.close();
		s.close();
	}

}
