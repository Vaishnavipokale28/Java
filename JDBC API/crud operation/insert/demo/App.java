package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	Student s1 = new Student();
    	s1.setSname("vaishnavi pokale");
    	s1.setScity("pune");
    	s1.setSpercentage(88.45);
    	System.out.println(sd.insertStudent(s1));
    }
}
