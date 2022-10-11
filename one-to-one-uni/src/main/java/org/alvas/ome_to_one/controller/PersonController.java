package org.alvas.ome_to_one.controller;

import java.util.Scanner;

import org.alvas.one_to_one.dao.PersonDao;
import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonController {
	static Person person = new Person();
	static Adhar adhar  = new Adhar();
	static PersonDao dao = new PersonDao();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("1. Save Person Adhar Details");
System.out.println("Enter the choice");
int ch = sc.nextInt();
switch(ch) {
case 1:
	person.setName("Amisha");
	person.setEmail("ami@gmail.com");
	adhar.setAadharno(98700445);
	adhar.setAddress("Mijar");
	
	person.setAdhar(adhar);
	dao.savePerson(person,adhar);
break;

case 2:
	Person person = dao.getPersonAdhar(5);
	System.out.println("Person details");
	System.out.println(person.getId()+ "   "+person.getName()+"  "+person.getEmail());
	System.out.println("Adhar details");
	System.out.println(person.getAdhar().getId());
	System.out.println(person.getAdhar().getAadharNo());
	System.out.println(person.getAdhar().getAddress());
	
case 3: 
	dao.deletePersonAdhar(7);
	break;
case 4:
	dao.updatePersonAdhar(6, "Ami", 232323223);
	}
	}

}
