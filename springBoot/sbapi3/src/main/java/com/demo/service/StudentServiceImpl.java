package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements  StudentService{

	@Autowired
	private StudentDao sd;

	@Override
	public List<Student> findAll() {
		return sd.findAll();
	}

	@Override
	public Student findBySid(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public Student findBySidAndSname(int sid, String sname) {
		return sd.findBySidAndSname(sid, sname);
	}

	@Override
	public List<Student> findBySnameContains(String sname) {
		return sd.findBySnameContains(sname);
	}

	@Override
	public List<Student> findBySpercentageBetween(double low, double high) {
		return sd.findBySpercentageBetween(low, high);
	}

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public List<Student> findByAny(String s1) {
		return sd.findByAny(s1);
	}

	@Override
	public int deleteBySid(int sid) {
		return sd.deleteBySid(sid);
	}

	

	
}
