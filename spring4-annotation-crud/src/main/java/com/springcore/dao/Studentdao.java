package com.springcore.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.dto.Student;
@Component
public class Studentdao {
@Autowired
	Student student;
@Autowired
EntityManagerFactory emf ;
EntityManager em;
EntityTransaction et;
public Student saveStudent(Student s) {
	 em = emf.createEntityManager();
	et = em.getTransaction();
	et.begin();
	em.persist(s);
	et.commit();
	
	return s;
	
}

public Student updateStudent(Student s,int id) {	
	 em = emf.createEntityManager();
		et = em.getTransaction();
		Student s1 = em.find(Student.class, id);
		et.begin();
		em.merge(s);
		et.commit();	
		return s1;		
}
}

