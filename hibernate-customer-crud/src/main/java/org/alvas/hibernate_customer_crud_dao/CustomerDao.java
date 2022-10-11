package org.alvas.hibernate_customer_crud_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.alvas.hibernate_customer_crud_dto.Customer;

public class CustomerDao {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction et;

	public Customer saveCustomer(Customer customer) {
		emf = Persistence.createEntityManagerFactory("vikas");
		 em = emf.createEntityManager();
		 et = em.getTransaction();
		if(customer!=null) {
		et.begin();
		em.persist(customer);
		et.commit();
		System.out.println("Data Stored");
		}
		else 
			System.out.println("Pls set the data");
		return customer;
	}
	public Customer updateCustomer(String name,int id) {
		emf = Persistence.createEntityManagerFactory("vikas");
		 em = emf.createEntityManager();
		 et = em.getTransaction();
	 Customer customer = em.find(Customer.class, id);
	 customer.setName(name);
			if(customer!=null) {
			et.begin();
			em.merge(customer);
			et.commit();
		System.out.println("Data Updated");
		}
		else 
			System.out.println("Pls set the data");
		return customer;
	}
	public Customer deleteCustomer(int id) {
		emf = Persistence.createEntityManagerFactory("vikas");
		 em = emf.createEntityManager();
		 et = em.getTransaction();
		Customer cust= em.find(Customer.class,id);
		if(cust!=null) {
		et.begin();
		em.remove(cust);
		et.commit();
		System.out.println("Deleted");
		}
		else 
			System.out.println("Pls specify valid id");
		return null;
	}
	public List<Customer> getAllData() {
		emf = Persistence.createEntityManagerFactory("vikas");
		 em = emf.createEntityManager();

		 String query = "SELECT s FROM Customer s";
			Query query2 = em.createQuery(query);
			List<Customer> list = query2.getResultList();
			list.forEach(a->System.out.println(a.getId()+ "  " +a.getName()+"  "+a.getEmail()));
		return null;	
	}
	public void getCustomerById(int id) {
		emf = Persistence.createEntityManagerFactory("vikas");
		 em = emf.createEntityManager();
		
		 Customer cust= em.find(Customer.class,id);
		System.out.println(cust);
		
	}
	

}
