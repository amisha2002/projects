package com.springcore.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("constructor.xml");
		User user = (User) ac.getBean("s2");
		System.out.println(user.id);
		System.out.println(user.name);
	}

}
