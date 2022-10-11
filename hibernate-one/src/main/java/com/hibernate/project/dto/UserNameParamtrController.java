package com.hibernate.project.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserNameParamtrController {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	String query = "SELECT u FROM User u where u.email=:name";
	Query query2 = entityManager.createQuery(query);
	
	query2.setParameter("name","ashwin@gmail.com");
	List<User> list = query2.getResultList();
	list.forEach(a->System.out.println(a.getId()+ "  " +a.getName()+"  "+a.getEmail()));
}
}