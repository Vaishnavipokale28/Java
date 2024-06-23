package com.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HBUtils;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
    
       Employee e =session.get(Employee.class, 266);
       e.setEname("Vaishnavi Pokale");
       
       Query q = session.createQuery("update Employee set ename=:a, edesignation=:b,ecompany=: c,esalary=: d where eid=:e");
       q.setParameter("a",e.getEname());
       q.setParameter("b",e.getEdesignation());
       q.setParameter("c",e.getEcompany());
       q.setParameter("d",e.getEsalary());
       q.setParameter("e",e.getEid());
       int check = q.executeUpdate();
       System.out.println(e);
      
      
      
      tx.commit();
      session.close();
       
    }
}
