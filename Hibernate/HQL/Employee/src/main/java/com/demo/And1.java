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
       
      Query<Employee> q = session.createQuery("from Employee where eid=:a and ename= :b",Employee.class);
      q.setParameter("a",1928);
      q.setParameter("b","SXNYZAGKVCQITNT");
      Employee e = q.uniqueResult();
      System.out.println(e);
       tx.commit();
       session.close();
       
    }
}
