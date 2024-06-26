package com.demo;

import java.util.List;
import java.util.Random;

import org.hibernate.Criteria;
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
    
       
       List <Employee>list = session.createCriteria(Employee.class)
       .list();
       for(Employee e:list)
    	   System.out.println(e);
      tx.commit();
      session.close();
       
    }
   
}











