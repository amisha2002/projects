package org.alvas.one_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;



public class MobileDao {

EntityManagerFactory emf;
EntityManager em ;
EntityTransaction et;

public Mobile saveMobileSim(Mobile mobile, Sim sim1,Sim sim2) {
	 emf = Persistence.createEntityManagerFactory("vikas");	
	 em = emf.createEntityManager();
	 et = em.getTransaction();
	 et.begin();
	 em.persist(mobile);
	 em.persist(sim1);
	 em.persist(sim2);
	 et.commit();
	return mobile;
}
public Mobile deleteMobileSim(int id) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	Mobile mobile = em.find(Mobile.class,id);
	et.begin();
	em.remove(mobile);
	for (Sim s : mobile.getSim()) {
		em.remove(s);
	}	
	et.commit();
	return mobile;	
}
public Mobile getById(int id) {
	emf = Persistence.createEntityManagerFactory("vikas");
	em = emf.createEntityManager();
	et = em.getTransaction() ;
	Mobile mobile = em.find(Mobile.class,id);	
	return mobile;
}
public Mobile updateMobileSim(int id, String Sname, String mname) {
	emf = Persistence.createEntityManagerFactory("vikas");
	 em = emf.createEntityManager();
	 et = em.getTransaction();
	 Mobile mobile = em.find(Mobile.class,id);
	 
	 et.begin();
	 mobile.setName(mname);
	 List <Sim> list = mobile.getSim();
	 for(Sim sim1 : list) {
		 if(sim1.getName().equals("JIO")) {
			 sim1.setName(Sname);
				em.merge(sim1);
		 }
	 }
	em.merge(mobile);

	et.commit();
	return mobile;
	
}

}
