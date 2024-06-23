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
    
       Employee e =session.get(Employee.class, 267);
       e.setEname("Vishvesh Rasane");
       e.setEdesignation("Pharmacist");
       
       int check = session.createQuery("update Employee set ename=:a,edesignation=:b,ecompany=:c,esalary=:d where eid=:e")
       .setParameter("a", e.getEname())
       .setParameter("b", e.getEdesignation())
       .setParameter("c", e.getEcompany())
       .setParameter("d",e.getEsalary())
       .setParameter("e", e.getEid())
       .executeUpdate();
       System.out.println(e);
      
      
      
      tx.commit();
      session.close();
       
    }
}
