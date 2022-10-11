package com.springcore.project;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
BeanFactory beanFactory = new ClassPathXmlApplicationContext("index.xml");
Student stud = (Student) beanFactory.getBean("s1");
stud.getStudent();
	}

}
