package com.hib.projectwithmaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

//import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import org.hiber
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
               	
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //creating student
        Student st = new Student(101, "John", "DELHI");
        System.out.println(st);
        
        //Creating address
        Address add = new Address();
        add.setCity("delhi");
        add.setStreet("dewra");
        add.setIsopen(true);
        add.setX(1234);
        add.setAddeddate(new Date());
        //add.setImage(null);
        
        FileInputStream fis = new FileInputStream("src/main/java/pic.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        add.setImage(data);
        
       
        
        //get current session
        Session session = factory.getCurrentSession();
        //if currentsession()  is not there then we will use opensession()
        
        //begin transaction
        session.beginTransaction();
        
        //save the session
        session.save(st);
        session.save(add);
        
        //commit the transaction        
        session.getTransaction().commit();
        
        //close the transaction
        session.close();
        
        
        
        
        
    }
}
