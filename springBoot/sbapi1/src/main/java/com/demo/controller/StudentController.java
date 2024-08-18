package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping(value="/",method= RequestMethod.GET)
	public String m1()
	{
		System.out.println("we are in m1 method");
		return "Hello";
	}
	
	@RequestMapping(value="/req1",method=RequestMethod.GET)
	public void m2() {
		System.out.println("We are in m2 method ");
	}
}
