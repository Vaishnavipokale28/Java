package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setEname("Akshay pawar");
        e1.setEcompany("VMT");
        e1.setEdesignation("Buisness Analyst");
        e1.setEsalary(468372);
        session.save(e1);
        
        tx.commit();
        session.close();
    }
}
