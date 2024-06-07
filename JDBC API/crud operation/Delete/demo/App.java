package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao sd = new StudentDao();
    	
    	System.out.println(sd.deleteStudentBySid(3));
    }
}
