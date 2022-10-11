package com.springcore.annotation.simple;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {

ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
Student student = (Student) ac.getBean("student");
student.getStudent();
}
}
