package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
    	Resource r = new ClassPathResource("bean.xml");
       BeanFactory factory = new XmlBeanFactory(r);
       Student s1 = factory.getBean(Student.class);
       System.out.println(s1);
       
    }
}
