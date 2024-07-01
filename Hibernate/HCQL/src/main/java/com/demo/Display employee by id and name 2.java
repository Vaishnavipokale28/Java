package com.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.config.HBUtils;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       Session session = HBUtils.sf.openSession();
       Transaction tx = session.beginTransaction();
    
       
       Object e = session.createCriteria(Employee.class)
       .add(Restrictions.eq("eid", 107))
       .add(Restrictions.eq("ename", "QFPYUMBRCPXSDHE"))
       .uniqueResult();
       System.out.println(e);
       
      tx.commit();
      session.close();
       
    }
   
}











