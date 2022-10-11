package com.hibernate.many_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.hibernate.many_to_many.dto.Student;
import com.hibernate.many_to_many.dto.Subjects;

public class StudentDao {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
EntityManager em;
EntityTransaction et;

public Student saveStudent(Student student1,Student student2, List<Subjects> list) {
	em=emf.createEntityManager();
	et=em.getTransaction();
	et.begin();
	em.persist(student1);
	em.persist(student2);
	for (Subjects subject : list) {
		em.persist(subject);			
	}
	et.commit();
	return student1;
}

public Student getById(int id) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	Student student = em.find(Student.class,id);	
	return student;
}
}