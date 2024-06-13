package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HBUtils;
import com.model.Employee;

class App 
{
    public static void main( String[] args )
    {
        Session session = HBUtils.sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setEname("Sanvi Pokale");
        e1.setEdesignation("JAVA Developer");
        e1.setEcompany("VMT");
        e1.setEsalary(393833);
        System.out.println(session.save(e1));
        
        tx.commit();
        session.close();
    }
}
