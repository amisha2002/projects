package com.springcore.annotation.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		Sports sport = (Sports) ac.getBean("sport");
		System.out.println(sport.getName());
		}
	}
