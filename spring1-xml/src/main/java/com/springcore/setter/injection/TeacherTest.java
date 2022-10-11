package com.springcore.setter.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherTest {
public static void main(String[] args) {
	ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("setterinjection.xml");
	Teacher teacher = (Teacher) ac.getBean("s3");
	System.out.println(teacher.getId());
	System.out.println(teacher.getName());
	System.out.println(teacher.getSub());
}
}
