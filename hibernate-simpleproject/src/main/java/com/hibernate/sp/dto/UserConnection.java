package com.hibernate.sp.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class UserConnection {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		User user=new User();
		user.setId(102);
		user.setName("ashlyn");
		user.setEmail("ashlyndcosta93@gmail.com");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

	}

}
