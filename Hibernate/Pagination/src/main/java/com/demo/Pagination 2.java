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
    
       
       paginationPage(session,40);
      
      tx.commit();
      session.close();
       
    }
    
    public static void paginationAll(Session session,int size)
    {
    	int page=0;
    	while(true)
    	{
    		List<Employee> list = session.createQuery("from Employee",Employee.class)
    				.setMaxResults(size)
    				.setFirstResult(page*size)
    		.list();
    		if(!list.isEmpty())
    		{
    			System.out.println("page Number: "+(++page));
    			System.out.println("-----------------------------------");
    			for(Employee e:list)
    				System.out.println(e);
    		}
    		else
    			break;
    	}
    	
    }
    
    public static void paginationPage(Session session,int page)
    {
    	int size = 10;
		List<Employee> list = session.createQuery("from Employee",Employee.class)
    	.setFirstResult((page-1)*size )
    	.setMaxResults(size)
    	.list();
		for(Employee e:list)
			System.out.println(e);
    }
}











