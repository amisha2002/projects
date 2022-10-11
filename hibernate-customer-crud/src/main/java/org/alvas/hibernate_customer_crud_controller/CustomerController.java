package org.alvas.hibernate_customer_crud_controller;

import java.util.Scanner;

import org.alvas.hibernate_customer_crud_dao.CustomerDao;
import org.alvas.hibernate_customer_crud_dto.Customer;
public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer customer;
		CustomerDao dao = new CustomerDao();
		while(true) {
			System.out.println("1. Save Customer");
			System.out.println("2. Update Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Display All Customer");
			System.out.println("5. Display a Customer");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: 
				customer = new Customer();
				System.out.println("Enter customer name");
				String name = sc.next();
				customer.setName(name);
				System.out.println("Enter customer email");
				String email = sc.next();
				customer.setEmail(email);
				dao.saveCustomer(customer);
			break;
			case 2:
				customer = new Customer();
				System.out.println("Enter customer id");
				int id = sc.nextInt();
				System.out.println("Enter customer name");
				String name2 = sc.next();
				customer.setName(name2);
				dao.updateCustomer(name2, id);
				break;
			case 3:
				System.out.println("Enter customer id");
				int id1 = sc.nextInt();
				dao.deleteCustomer(id1);
				break;
			case 4:
				dao.getAllData();
				break;
			case 5:
				System.out.println("Enter customer id");
				int id2 = sc.nextInt();
				dao.getCustomerById(id2);
			}
		}
	}

}
