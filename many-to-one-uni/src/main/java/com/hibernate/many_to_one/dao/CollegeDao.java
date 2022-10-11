package com.hibernate.many_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.many_to_one.dto.Building;
import com.hibernate.many_to_one.dto.College;

public class CollegeDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em;
	EntityTransaction et;

	public Building saveBuildingCollege(College college, Building building1, Building building2) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		//em.persist(college);
		em.persist(building1);
		em.persist(building2);

		et.commit();

		return building2;
	}
	public Building deleteBuildingCollege(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Building building = em.find(Building.class, id);
		
		et.begin();
		em.remove(building);
		et.commit();	
		return null;	
	}
	
}
