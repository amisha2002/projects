package com.springcore.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.MyConfig;
import com.springcore.dto.Student;
import com.springcore.service.StudentService;

public class StudentUpdateController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class );
		StudentService ss = (StudentService) ac.getBean("myService");
		 Student s = (Student) ac.getBean("student");
//		s.setName("Ashlyn");
//		s.setEmail("ashlyn@gmail.com");		
		ss.updateStudent("Aaa","aa@gmail.com",101);
	}

}
