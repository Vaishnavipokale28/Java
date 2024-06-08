package com.demo;



import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	
    	Student s1 = sd.findstudentBySid(2);
    	s1.setSpercentage(78.80);
    	System.out.println(sd.updateStudent(s1));
    }
}
