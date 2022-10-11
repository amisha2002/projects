package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonDao {
EntityManagerFactory emf ;
EntityManager em;
EntityTransaction et;

public Person savePerson(Person person,Adhar adhar) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	et.begin();
	em.persist(adhar);
	em.persist(person);

	et.commit();
	return person;	
}
//get person and adhar details
public Person getPersonAdhar(int id) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	Person person = em.find(Person.class, id);
	return person;
}
public Person deletePersonAdhar(int id) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	Person person = em.find(Person.class,id);
	Adhar adhar = em.find(Adhar.class, person.getAdhar().getId());
	et.begin();
	em.remove(person);
	em.remove(adhar);
	et.commit();
	return null;	
}
public Person updatePersonAdhar(int id,String name, long adharNo) {
	emf = Persistence.createEntityManagerFactory("vikas");
	 em = emf.createEntityManager();
	 et = em.getTransaction();
	 Person person = em.find(Person.class,id);
		Adhar adhar = em.find(Adhar.class, person.getAdhar().getId());
		person.setName(name);
		adhar.setAadharno(909090909);	
		et.begin();
		em.merge(person);
		em.merge(adhar);
		et.commit();
	return null;
	
}

}
