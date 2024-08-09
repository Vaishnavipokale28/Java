package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(App.class, args);
	StudentService ss = context.getBean(StudentService.class);
	 
//	Student s1 = new Student();
//	s1.setSname("Anushree");
//	s1.setScity("Aurangabad");
//	s1.setSpercentage(99);
//	System.out.println(ss.save(s1));

//	Student s1 = new Student();
//	s1.setSid(3);
//	s1.setSname("Pratham");
//	s1.setScity("Nagpur");
//	s1.setSpercentage(78.6);
//	System.out.println(ss.save(s1));
	
	//System.out.println(ss.deleteBySid(8));
	
	//System.out.println(ss.deleteBySname("pratham"));
	
//	for(int i=1; i<=5000;i++)
//	{
//		Student s1 = new Student();
//		StringBuilder name = new StringBuilder();
//		StringBuilder city = new StringBuilder();
//		for(int j=1;j<=15;j++)
//		{
//			name.append((char)(new Random().nextInt(26)+65));
//			city.append((char)(new Random().nextInt(26)+65));
//			
//		}
//		s1.setSname(name.toString());
//		s1.setScity(name.toString());
//		s1.setSpercentage(new Random().nextDouble()*100);
//		ss.save(s1);
//	}

//	System.out.println(ss.findBySid(2000));
	
//	List<Student>list=ss.findBySname("KJRLQRFFTUPQZRM");
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student>list = ss.findBySnameAndScity("PJYWZPULYBLXHET", "PJYWZPULYBLXHET");
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student>list=ss.findBySnameOrScity("INKOWXQDLSOLTXO", "XOQXMVXVRIRPFEB");
//	for(Student s: list)
//		System.out.println(s);
//	
	
//	List<Student>list=ss.findBySpercentageLessThan(10);
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student>list = ss.findBySpercentageGreaterThan(95);
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student> list = ss.findBySpercentageBetween(80, 82);
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Integer> listid= new ArrayList();
//	listid.add(10);
//	listid.add(20);
//	List<Student> list =ss.findBySidIn(listid);
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student> list = ss.findBySnameStartsWith("VAI");
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student> list = ss.findBySnameEndsWith("ZA");
//	for(Student s:list)
//		System.out.println(s);
	
//	List<Student> list = ss.findBySnameContains("VIS");
//	for(Student s:list)
//		System.out.println(s);
	
//	Student s1 = ss.m1(22);
//	System.out.println(s1);
	
	List<Student> list= ss.m2(90, "TMOUGMLETLNWFSP");
	for(Student s:list)
		System.out.println(s);
	}

}
