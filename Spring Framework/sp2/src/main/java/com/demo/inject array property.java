package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
    	Student s1 = context.getBean(Student.class);
    	System.out.println(s1);
    	
    }
}
