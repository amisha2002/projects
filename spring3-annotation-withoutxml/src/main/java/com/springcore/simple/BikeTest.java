package com.springcore.simple;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.MyConfig;

public class BikeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
Bike bike = (Bike) ac.getBean("myBike");
 bike.getBike();
	}

}
