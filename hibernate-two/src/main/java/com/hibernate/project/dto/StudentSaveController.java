package com.hibernate.project.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentSaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Student stud=new Student();
		stud.setId(103);
		stud.setName("ashlyn");
		stud.setEmail("ashlyn@gmail.com");
		stud.setPhno(9090990);

		entityTransaction.begin();
		entityManager.persist(stud);
		entityTransaction.commit();
	}

}
