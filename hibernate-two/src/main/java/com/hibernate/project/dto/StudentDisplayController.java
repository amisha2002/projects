package com.hibernate.project.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDisplayController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		String query = "SELECT s FROM Student s";
		Query query2 = entityManager.createQuery(query);
		List<Student> list = query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+ "  " +a.getName()+"  "+a.getEmail()+"  "+a.getPhno()));
	}
	}