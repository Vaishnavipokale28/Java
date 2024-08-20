package com.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;

@RestController
public class StudentController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public void m1()
	{
		System.out.println("We are in m1 method");
	}
	
	
	
	@GetMapping(value="/req2")
	public int m3(int a,int b) {
		System.out.println("a="+a+"b="+b);
		 return a+b;
		 
	}
	
	@GetMapping(value="req3")
	public String m4(int a, String b) {
		System.out.println("a="+a+"b="+b);
		return a+b;
	}
	
	@GetMapping(value ="/req4/{a}/{b}")
	public String m5(@PathVariable int a,@PathVariable String b) {
		System.out.println("a="+a+"b="+b);
		return a+b;
	}
	
	@GetMapping(value="/req5")
	public int[] m6(@RequestBody int a[])
	{
		System.out.println(Arrays.toString(a));
		return a;
	}
	
//	@GetMapping(value="/req6")
//	public Student m7(@RequestBody Student s1) {
//		System.out.println(s1);
//		return s1;
//	}
	
	@GetMapping(value="/req7/{a}/{b}")
	public Map<String, Object> m8(@RequestBody Student s1, @PathVariable int a, @PathVariable int b)
	{
		Map<String, Object> m = new HashMap();
		m.put("s1",s1);
		m.put("a", a);
		m.put("b",b);
		return m;
	}
	
	@GetMapping(value="/req8")
	public List<Student> m9(@RequestBody List<Student> list){
	return list;
	}
}
