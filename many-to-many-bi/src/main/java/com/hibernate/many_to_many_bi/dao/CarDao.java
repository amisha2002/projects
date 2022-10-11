package com.hibernate.many_to_many_bi.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.many_to_many_bi.dto.Car;
import com.hibernate.many_to_many_bi.dto.Features;

public class CarDao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
EntityManager em ;
EntityTransaction et;

public Car saveCar(List<Car> cars, List<Features> features) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	et.begin();
	for(Features f : features) {
		em.persist(f);
	}
	for(Car c : cars) {
		em.persist(c);
	}
	et.commit();
	return null;
}
}
