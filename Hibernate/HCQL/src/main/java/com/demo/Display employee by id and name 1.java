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
    
       
       Criteria c = session.createCriteria(Employee.class);
       c.add(Restrictions.and(Restrictions.eq("eid", 91)).add(Restrictions.eq("ename","CPFGQINTCDOFYXM")));
       Employee e = (Employee) c.uniqueResult();
       System.out.println(e);
       
      tx.commit();
      session.close();
       
    }
   
}











