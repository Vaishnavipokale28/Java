package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	
		List<Student> findAll();
		
		Student findBySid(int sid);
		
		Student findBySidAndSname(int sid,String sname);
		
		List<Student> findBySnameContains(String sname);
		
		List<Student> findBySpercentageBetween(double low, double high);
		
		@Query(value = "select sid, sname, scity, spercentage from Student where sid=?1 or spercentage=?1 or sname like %?1% or scity like %?1%", nativeQuery = true)
		List<Student> findByAny(String s1);
		
		Student save(Student s);
		
		int deleteBySid(int sid);
		
		
	
		

}
