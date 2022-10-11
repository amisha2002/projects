package com.springcore.annotation.ref.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollegeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
College c = (College) ac.getBean("myCollege");
c.getCollege();

	}

}
