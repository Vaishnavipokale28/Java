package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	List<Student> findAll();
	
	Student findBySid(int sid);
	
	Student findBySidAndSname(int sid,String sname);
	
	List<Student> findBySnameContains(String sname);
	
	List<Student> findBySpercentageBetween(double low, double high);
	
	List<Student> findByAny(String s1);
	
	Student save(Student s);
	
	int deleteBySid(int sid);
}
