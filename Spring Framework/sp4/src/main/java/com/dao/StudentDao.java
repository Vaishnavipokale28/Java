package com.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertStudent(Student s)
	{
		String sql = "insert into student(sname,scity,spercentage)value(?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}
	
}
