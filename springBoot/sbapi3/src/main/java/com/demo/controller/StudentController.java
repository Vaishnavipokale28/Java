package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService ss;
	
	@GetMapping(value="/")
	public List<Student> home()
	{
		return ss.findAll();
	}
	
	@GetMapping(value="/findbyid/{id}")
	public Student m1(@PathVariable int id) {
		return ss.findBySid(id);
	}
	
	@GetMapping(value="/findbyidandname/{id}/{name}")
	public Student m2(@PathVariable int id, @PathVariable String name) {
		return ss.findBySidAndSname(id, name);
	}
	
	@GetMapping(value="/findnamecontains/{sname}")
	public List<Student> m3(@PathVariable String sname){
		return ss.findBySnameContains(sname);
	}
	
	@GetMapping(value ="/findbypercentagebetween/{low}/{high}")
	public List<Student> m4(@PathVariable double low , @PathVariable double high){
		return ss.findBySpercentageBetween(low, high);
	}
	
	@GetMapping(value ="/findbyany/{s1}")
	public List<Student> m5(@PathVariable String s1){
		return ss.findByAny(s1);
	}
	
	
	@PostMapping(value="/save")
	public Student m6(@RequestBody Student s1) {
		return ss.save(s1);
	}
	
	@PutMapping(value="/update")
	public Student m7(@RequestBody Student s1) {
		return ss.save(s1);
	}
	
	@DeleteMapping(value="/deletebyid/{sid}")
	public int m8(@PathVariable int sid) {
		return ss.deleteBySid(sid);
	}
}
