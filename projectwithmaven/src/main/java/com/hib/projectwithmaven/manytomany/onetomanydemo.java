package com.hib.projectwithmaven.manytomany;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class onetomanydemo {
	public static void main(String args[])
	{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	Employee e1 = new Employee();
	e1.setEid(123);
	e1.setEmpname("isha");
	
	Employee e2 = new Employee();
	e2.setEid(67);
	e2.setEmpname("boshai");
	
	
	Project p1 = new Project();
	p1.setPid(789);
	p1.setPname("library mgt system");
	
	Project p2 = new Project();
	p2.setPid(789);
	p2.setPname("testing mgt system");
	
	List<Employee> list1 = new ArrayList<Employee>();
	List<Project>  list2= new ArrayList<Project>();
	
	list1.add(e1);
	list1.add(e2);
	
	list2.add(p1);
	list2.add(p2);
	
	e1.setProjects(list2);
	p2.setEmployee(list1);
	
	Session session = factory.openSession();
Transaction tx = session.beginTransaction();

	session.save(e1);
	session.save(e2);
	session.save(p1);
	session.save(p2);
	}
}
