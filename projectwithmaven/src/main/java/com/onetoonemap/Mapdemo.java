package com.onetoonemap;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapdemo {
	
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		
		Question q1= new Question();
		q1.setQuestionId(123);
		q1.setQuestion("what is java");
		
		Answer a1 = new Answer();
		a1.setAnswerId(190);
		a1.setAnswer("it is programming lanugage");
		q1.setAnswer(a1);
		
		
		Session s = factory.openSession();
		Transaction tx= s.beginTransaction();
		
		s.save(q1);
		s.save(a1);
		
		tx.commit();
		
		
		
		
		factory.close();
	}

}
