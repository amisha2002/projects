package com.hibernate.project.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserGetById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String query = "SELECT u FROM User u where u.name=?1";
		Query query2 = entityManager.createQuery(query);
		query2.setParameter(1, "amisha");
		List<User> list = query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+ "  " +a.getName()+"  "+a.getEmail()));
	}

}
