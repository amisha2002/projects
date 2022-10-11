package com.hibernate.project.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDeleteController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Student stud= entityManager.find(Student.class, 103);
		entityTransaction.begin();
		entityManager.remove(stud);
		entityTransaction.commit();
		System.out.println("Deleted");

	}

}
