package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Student;

public interface StudentService {
	Student save(Student s);
	
	int deleteBySid(int sid);
	
	int deleteBySname(String sname);
	
	Student findBySid(int sid);
	
	List<Student> findBySname(String sname);
	
	List<Student> findBySnameAndScity(String sname, String scity);
	
	List<Student> findBySnameOrScity(String sname,String scity);
	
	List<Student>m2(@Param("a")int sid ,@Param("b") String sname);
	
	List<Student> findBySpercentageLessThan(double spercentage);
	
	List<Student> findBySpercentageGreaterThan(double spercentage);
	
	List<Student>findBySpercentageBetween(double low, double high);
	
	List<Student> findBySidIn(List<Integer> sid);
	
	List<Student> findBySnameStartsWith(String sname);
	
	List<Student> findBySnameEndsWith(String sname);
	
	List<Student>findBySnameContains(String sname);
	
	Student m1 (@Param("a")int sid);

}
