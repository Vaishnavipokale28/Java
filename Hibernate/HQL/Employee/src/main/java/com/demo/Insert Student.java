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
       
       for(int i=1;i<=5000;i++)
       {
    	   Employee e = new Employee();
    	   StringBuilder name = new StringBuilder();
    	   for(int j=1;j<=15;j++)
    		   name.append((char)(new Random().nextInt(26)+65));
    	   e.setEname(name.toString());
    	   StringBuilder designation = new StringBuilder();
    	   for(int j=1;j<=15;j++)
    		   designation.append((char)(new Random().nextInt(26)+65));
    	   e.setEdesignation(designation.toString());
    	   StringBuilder company = new StringBuilder();
    	   for(int j=1;j<=15;j++)
    		   company.append((char)(new Random().nextInt(26)+65));
    	   e.setEcompany(company.toString());
    	   e.setEsalary(new Random().nextDouble()*1000.0);
    	   session.save(e);
       }
       
       tx.commit();
       session.close();
       
    }
}
