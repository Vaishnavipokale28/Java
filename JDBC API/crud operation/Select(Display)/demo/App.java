package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	
    	Student s1 = sd.findstudentBySid(1);
    	System.out.println(s1);
    }
}
