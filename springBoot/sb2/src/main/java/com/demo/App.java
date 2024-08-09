package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(App.class, args);
	StudentDao sd = context.getBean(StudentDao.class);
//	Student s1 = sd.findStudentBySid(3);
//	System.out.println(s1);
	
//	List<Student> list = sd.findAllStudent();
//	for(Student s:list)
//		System.out.println(s);
	
	Student s1 = sd.findStudentBySid(2);
	s1.setSname("Shruti");
	System.out.println(sd.updateStudent(s1));
	
	}

}