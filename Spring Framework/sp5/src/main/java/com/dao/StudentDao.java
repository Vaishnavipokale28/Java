package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.model.Student;
import com.model.StudentRowMapper;

@Component
public class StudentDao {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insertStudent(Student s)
	{
		String sql= "insert into student (sname,scity,spercentage)values(?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
		
	}
	
	public int deleteStudent(int sid)
	{
		String sql = "delete from Student where sid=?";
		return jdbcTemplate.update(sql,sid);
		
	}
	
	public Student findStudentBySid(int sid)
	{
		Student s1 = null;
		String sql = "select sid,sname,scity,spercentage from student where sid=?";
		List<Student> list = jdbcTemplate.query(sql,new StudentRowMapper(),sid);
		if(!list.isEmpty())
			s1=list.get(0);
		return s1;
	}
	
	public List<Student> findAllStudent()
	{
		String sql = "select sid,sname,scity,spercentage from Student";
		return jdbcTemplate.query(sql,new StudentRowMapper());
	}
	
	public int updateStudent(Student s)
	{
		String sql = "update Student set sname=?,scity=?,spercentage=? where sid=?";
		return jdbcTemplate.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage(),s.getSid()});
		
	}
	
	

}
