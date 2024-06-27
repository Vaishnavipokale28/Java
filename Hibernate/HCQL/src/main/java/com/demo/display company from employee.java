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
    
    List<String>list=session.createCriteria(Employee.class)
    		.setProjection(Projections.property("ecompany"))
    		.list();
    for(String s:list)
    	System.out.println(s);
       
      tx.commit();
      session.close();
       
    }
   
}




