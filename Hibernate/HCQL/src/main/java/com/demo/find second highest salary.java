package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.config.HBUtils;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
    
     Employee e = (Employee) session.createCriteria(Employee.class)
     .add(Restrictions.eq("esalary",  session.createCriteria(Employee.class)
      .add(Restrictions.lt("esalary",  session.createCriteria(Employee.class)
       .setProjection(Projections.max("esalary"))
       .uniqueResult()))
      .setProjection(Projections.max("esalary"))
     .uniqueResult()))
     .uniqueResult();
     System.out.println(e);
     
      tx.commit();
      session.close();
       
    }
   
}




