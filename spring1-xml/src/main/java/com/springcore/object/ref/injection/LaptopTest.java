package com.springcore.object.ref.injection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopTest {
public static void main(String[] args) {
	ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("object-ref-setter-injection.xml");
	Laptop laptop = (Laptop) ac.getBean("s4");
	laptop.getLaptop();
}
}
