package com.springcore.annotation.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Customer cust = (Customer) ac.getBean("myCust");
		cust.print();
		}
	}

