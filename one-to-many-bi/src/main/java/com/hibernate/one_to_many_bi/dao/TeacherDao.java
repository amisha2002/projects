package com.hibernate.one_to_many_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.one_to_many_bi.dto.Subject;
import com.hibernate.one_to_many_bi.dto.Teacher;

public class TeacherDao {

EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
EntityManager em ;
EntityTransaction et;
public Teacher saveTeacherSubject(Teacher teacher,List<Subject> subject) {
	em = emf.createEntityManager();
	et = em.getTransaction();
	et.begin();
	for (Subject subject2 : subject) {
		em.persist(subject2);
	}
	em.persist(teacher);
	et.commit();	
	return teacher;
	
}
}
