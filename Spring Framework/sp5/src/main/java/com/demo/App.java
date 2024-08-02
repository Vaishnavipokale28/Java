package com.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new 
        		AnnotationConfigApplicationContext(MyConfiguration.class);
        StudentDao sd = context.getBean(StudentDao.class);
       // Student s1 = new Student();
       // s1.setSname("Atharva");
       // s1.setScity("Aurangabad");
       // s1.setSpercentage(96.8);
       // System.out.println(sd.insertStudent(s1));
       // System.out.println(sd.deleteStudent(4));
       // Student s1 = sd.findStudentBySid(4);
       // System.out.println(s1);
        //List<Student> list = sd.findAllStudent();
       // for(Student s:list)
        //	System.out.println(s);
        Student s1 = sd.findStudentBySid(5);
        s1.setSname("Sanvi Pokale");
        s1.setScity("Paithan");
        s1.setSpercentage(84.9);
        System.out.println(sd.updateStudent(s1));  
        
    }
}
