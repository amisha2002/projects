package com.hibernate.many_to_many_bi.controller;

import java.util.Arrays;
import java.util.List;

import com.hibernate.many_to_many_bi.dao.CarDao;
import com.hibernate.many_to_many_bi.dto.Car;
import com.hibernate.many_to_many_bi.dto.Features;

public class CarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDao dao = new CarDao();

		Car c1 = new Car();
		Car c2 = new Car();

		Features f1 = new Features();
		Features f2 = new Features();
		
		c1.setCarname("benz");
		c1.setCarPrice(90000000);
		
		c2.setCarname("kia");
		c2.setCarPrice(10000000);
		
		List<Car> cars = Arrays.asList(c1,c2);
		f1.setFeatureName("v16");
		f2.setFeatureName("1000hp");
		
		List<Features> features = Arrays.asList(f1,f2);
		
		c1.setFeatures(features);
		c2.setFeatures(features);
		f1.setCars(cars);
		f2.setCars(cars);
		
		dao.saveCar(cars, features);
	}

}
