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
       
      Query<Employee>q = session.createQuery("delete from Employee where eid=:a");
      q.setParameter("a",20);
      int check = q.executeUpdate();
      System.out.println(check);
      
      
      
      
      tx.commit();
      session.close();
       
    }
}
