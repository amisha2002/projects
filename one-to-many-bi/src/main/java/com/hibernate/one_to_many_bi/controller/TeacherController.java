package com.hibernate.one_to_many_bi.controller;

import java.util.Arrays;
import java.util.List;

import com.hibernate.one_to_many_bi.dao.TeacherDao;
import com.hibernate.one_to_many_bi.dto.Subject;
import com.hibernate.one_to_many_bi.dto.Teacher;

public class TeacherController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherDao dao = new TeacherDao();
		Teacher teacher1 = new Teacher();
		
		teacher1.setTeacherName("Amisha");
		teacher1.setTeacherEmail("a@gmail.com");
		Subject subject1 = new Subject();
		Subject subject2 = new Subject();
		
		subject1.setSubName("abc");
		subject1.setAuthor("xyz");
		subject1.setTeacher(teacher1);
		
		subject2.setSubName("pqr");
		subject2.setAuthor("rst");
		subject2.setTeacher(teacher1);
		
		List<Subject> list = Arrays.asList(subject1,subject2);
		
		dao.saveTeacherSubject(teacher1, list);
		
		
	}

}
