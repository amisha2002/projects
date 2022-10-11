package com.springcore.controller;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.MyConfig;
import com.springcore.dto.Student;
import com.springcore.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class );
		StudentService ss = (StudentService) ac.getBean("myService");
		 Student s = (Student) ac.getBean("student");
		s.setId(102);
		s.setName("Ashlyn");
		s.setEmail("ash@gmail.com");
		
		ss.saveStudent(s);

	}

}
