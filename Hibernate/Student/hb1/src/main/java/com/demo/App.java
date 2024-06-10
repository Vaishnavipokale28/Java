package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration().configure();
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       Student s1 = new Student();
       s1.setSname("vaishnavi pokale");
       s1.setScity("Pune");
       s1.setSpercentage(83.33);
       System.out.println(session.save(s1));
       tx.commit();
       session.close();
    }
}
