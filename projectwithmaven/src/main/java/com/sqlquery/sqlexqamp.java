package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.postgresql.core.NativeQuery;

import com.hib.projectwithmaven.Student;

public class sqlexqamp {
	
	
	public static void main(String[] args) {
		SessionFactory fact =  new Configuration().configure().buildSessionFactory();
		
		Session s = fact.openSession();
		
		
		//THIS IS SQL QUERY
		String q = "select * from student";
		NativeQuery nq = s.createSQLQuery(q);
		List<Object[] > list= nq.list();
		
		for(Object[] st: list)
		{
			System.out.println(st[3]);
		}
		
		//st[3] means dfrom student atble it will give 3rd column. as per 0based indexing
		
		s.close();
		fact.close();
		
		
		
	}

}
