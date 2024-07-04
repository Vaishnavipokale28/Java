package com.demo;

import java.util.ArrayList;
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
    
       List<Integer> list = new ArrayList();
       list.add(10);
       list.add(60);
       list.add(1987);
       list.add(23);
       list.add(679);
       list.add(4548);
       
     Criteria c = session.createCriteria(Employee.class);
     if(!list.isEmpty())
    	 c.add(Restrictions.in("eid", list));
     List <Employee>list1 = c.list();
     for(Employee e:list1)
    	 System.out.println(e);
       
      tx.commit();
      session.close();
       
    }
   
}




