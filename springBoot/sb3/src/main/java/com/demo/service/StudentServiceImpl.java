package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public int deleteBySid(int sid) {
		return sd.deleteBySid(sid);
	}

	@Override
	public int deleteBySname(String sname) {
		return sd.deleteBySname(sname);
	}

	@Override
	public Student findBySid(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public List<Student> findBySname(String sname) {
		return sd.findBySname(sname);
	}

	@Override
	public List<Student> findBySnameAndScity(String sname, String scity) {
		return  sd.findBySnameAndScity(sname, scity);
	}

	@Override
	public List<Student> findBySnameOrScity(String sname, String scity) {
		return sd.findBySnameOrScity(sname, scity);
	}

	@Override
	public List<Student> findBySpercentageLessThan(double spercentage) {
		return sd.findBySpercentageLessThan(spercentage);
	}

	@Override
	public List<Student> findBySpercentageGreaterThan(double spercentage) {
		return sd.findBySpercentageGreaterThan(spercentage);
	}

	@Override
	public List<Student> findBySpercentageBetween(double low, double high) {
		return sd.findBySpercentageBetween(low, high);
	}

	@Override
	public List<Student> findBySidIn(List<Integer> sid) {
		return sd.findBySidIn(sid);
	}

	@Override
	public List<Student> findBySnameStartsWith(String sname) {
		return sd.findBySnameStartsWith(sname);
	}

	@Override
	public List<Student> findBySnameEndsWith(String sname) {
		return sd.findBySnameEndsWith(sname);
	}

	@Override
	public List<Student> findBySnameContains(String sname) {
		return sd.findBySnameContains(sname);
		
	}

	@Override
	public Student m1(int sid) {
		return  sd.m1(sid);
	}

	@Override
	public List<Student> m2(int sid, String sname) {
		return sd.m2(sid, sname);
	}

}
