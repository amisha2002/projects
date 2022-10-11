package com.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.dao.Studentdao;
import com.springcore.dto.Student;

@Component(value="myService")
public class StudentService {	
		@Autowired
		Studentdao dao;
		
		public Student saveStudent(Student s) {
			if(s.getId()>100) {
				return dao.saveStudent(s);
			} else {
				System.out.println("provide id");
			return null;
		}
		}
	
		public Student updateStudent(String name, String email ,int id) {	
			Student s = new Student();
			s.setName(name);
			s.setEmail(email);
				return dao.updateStudent(s,id);
		}
		}

