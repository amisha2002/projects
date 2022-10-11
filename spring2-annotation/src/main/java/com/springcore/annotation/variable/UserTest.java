package com.springcore.annotation.variable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		User user = (User) ac.getBean("myUser");
		user.print();
		}
	}


