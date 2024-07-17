package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class MyConfiguration {
	
	@Bean
	public  Student m1()
	{
		return new Student();
		
	}

}
