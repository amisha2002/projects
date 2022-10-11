package com.hibernate.many_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.hibernate.many_to_many.dao.StudentDao;
import com.hibernate.many_to_many.dto.Student;
import com.hibernate.many_to_many.dto.Subjects;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int ch = sc.nextInt();
		StudentDao dao=new StudentDao();
		switch(ch) {
		case 1:
		
		
		Subjects sub1=new Subjects();
		Subjects sub2=new Subjects();

		Student std1=new Student();
		Student std2=new Student();
		
		sub1.setSubjectName("CNS");
		sub1.setSubjectAuthor("jammes");
		sub2.setSubjectName("co");
		sub2.setSubjectAuthor("dannies");
		
		List<Subjects> subject=Arrays.asList(sub1,sub2);
		std1.setStudentName("bhagi");
		std1.setStudentPhone(121324);
		std1.setSubjects(subject);
		
		std2.setStudentName("sree");
		std2.setStudentPhone(234567);
		std2.setSubjects(subject);
		
		dao.saveStudent(std1,std2,subject);
	break;
		case 2:
			Student student = dao.getById(4);
			System.out.println("Mobile details");
			
			System.out.println(student.getStudentId()+ "   "+student.getStudentName()+"  "+student.getStudentPhone());
			System.out.println("Sim details");
			for (Subjects stud : student.getSubjects()) {
				System.out.println(stud.getSubjectId()+ "  " +stud.getSubjectName()+ "  "+stud.getSubjectAuthor());
			}
			break;
	}
	}
}

