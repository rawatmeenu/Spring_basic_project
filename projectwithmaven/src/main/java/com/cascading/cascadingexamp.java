package com.cascading;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoonemap.Answer;
import com.onetoonemap.Question;

public class cascadingexamp {
	
	public static void main(String[] args) {
		
		SessionFactory fac=  new Configuration().configure().buildSessionFactory();
		Session s = fac.openSession();
		
		Question q1= new Question();
		q1.setQuestionId(516);
		q1.setQuestion("what is cascar");
		Answer a1 = new Answer(178, "an hib cobcepy");
		Answer a2 = new Answer(18, "an  cobcepy");
		Answer a3 = new Answer(78, "hib cobcepy");
		
		List<Answer> list = new ArrayList<>();
		list.add(a3);
		list.add(a2);
		list.add(a1);
		q1.setAnswer(list);
		
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		//to avaoid last 3 lines we will use cascade like cascade=cascadeType.ALL in onetomany mapping
		tx.commit();
		
		
		s.close();
		fac.close();
		
		
		
		
		
	}

}
