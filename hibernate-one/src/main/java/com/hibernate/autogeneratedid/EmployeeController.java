package com.hibernate.autogeneratedid;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Employee emp=new Employee();
		
		emp.setName("ashlyn");
		emp.setEmail("ashlyn@gmail.com");
		
		entityTransaction.begin();
		entityManager.persist(emp);
		entityTransaction.commit();

	}

}
