package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

	Student save(Student s);
	
	int deleteBySid(int sid);
	
	int deleteBySname(String sname);
	
	Student findBySid(int sid);
	
	List<Student> findBySname(String sname);
	
	List<Student> findBySnameAndScity(String sname, String scity);
	
	List<Student> findBySnameOrScity(String sname,String scity);
	
	List<Student> findBySpercentageLessThan(double spercentage);
	
	List<Student> findBySpercentageGreaterThan(double spercentage);
	
	List<Student>findBySpercentageBetween(double low, double high);
	
	List<Student> findBySidIn(List<Integer> sid);
	
	List<Student> findBySnameStartsWith(String sname);
	
	List<Student> findBySnameEndsWith(String sname);
	
	List<Student>findBySnameContains(String sname);
	
	@Query(value="from Student where sid=:a")
	Student m1 (@Param("a")int sid);
	
	@Query(value ="from Student where sid=:a or sname=:b")
	List<Student>m2(@Param("a")int sid ,@Param("b") String sname);
}
