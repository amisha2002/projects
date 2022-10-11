package com.hibernate.one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.one_to_one_bi.dto.Pan;
import com.hibernate.one_to_one_bi.dto.Person;

public class PersonDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
	EntityManager em;
	EntityTransaction et;

	public Person savePerson(Person person, Pan pan) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		et.begin();
		em.persist(pan);
		em.persist(person);
		et.commit();
		return person;
	}
	public Person getById(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Person person = em.find(Person.class, id);
		return person;
		
	}
	public Person deletePersonPan(int id) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Person person = em.find(Person.class, id);
		Pan pan = em.find(Pan.class, person.getPersonId());
		et.begin();
		em.remove(person);
		em.remove(pan);
		et.commit();
		return null;
		
	}
	public Person updatePersonPan(int id, String pname, String address) {
		em = emf.createEntityManager();
		et = em.getTransaction();
		Person person = em.find(Person.class, id);
		Pan pan = em.find(Pan.class, person.getPersonId());
		person.setPersonName(pname);
		pan.setPanAddress(address);
		et.begin();
		em.merge(person);
		em.merge(pan);
		et.commit();
		return person;
		
	}
}
