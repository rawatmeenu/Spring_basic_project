package com.hib.projectwithmaven.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.projectwithmaven.Student;

public class HQLexample {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		//HQL
		//student is entity name
		String query = "from Student where city = 'lucknow'";
		
		String query1 = "from Student where city = :x";
		
		Query q = s.createQuery(query);
		Query q1= s.createQuery(query1);
	
		q1.setParameter("x", "lucknow");
		//single result(Unique result)
		
		//multiple result
		List<Student> list = q.list();
		
		for(Student s1 : list)
		{
			System.out.println(s1.getName());
		}
		
		
		System.out.println("______________________________________________");
		//delte query
		Transaction rx = s.beginTransaction();
		Query q2= s.createQuery("Delete from Student where city = :c");
		q2.setParameter("c", "ABC");
		int r = q2.executeUpdate();
		System.out.println("deleted");
		System.out.println(r);
		rx.commit();
		
	//update
		Query q3= s.createQuery("Update Student set city =:c where name =:n");
		q3.setParameter("c", "delhi");
		q3.setParameter("n", "meenu");
		int o = q3.executeUpdate();
		System.out.println( o + "obj updated");
		
		//how to execute join query
		Query q4 = s.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answer as a");
		
		List< Object []> list3 = q4.list();
		for(Object[] arr : list3)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		s.close();
		
		factory.close();
		
		
		
	}

	
}
