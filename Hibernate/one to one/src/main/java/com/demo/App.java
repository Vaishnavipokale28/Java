package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.config.HBUtils;
import com.model.Laptop;
import com.model.Student;


public class App 
{
    
    	public static void main( String[] args )
        {
           Session session = HBUtils.sf.openSession();
           Transaction tx = session.beginTransaction();
        
          int a[][] = {{1,4},{2,6},{3,1},{4,2},{5,8},{6,3},{7,5},{8,7}};
          for(int i=0;i<a.length;i++)
          {
        	  Student s1 =session.get(Student.class,a[i][0]);
        	  Laptop l1 = session.get(Laptop.class,a[i][1]);
        	  s1.setLaptop(l1);
        	  l1.setStudent(s1);
          }
          
          tx.commit();
          session.close();
           
        }
    
}
