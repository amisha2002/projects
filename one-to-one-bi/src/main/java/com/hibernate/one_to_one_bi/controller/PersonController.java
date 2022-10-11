package com.hibernate.one_to_one_bi.controller;

import java.util.Scanner;

import com.hibernate.one_to_one_bi.dao.PersonDao;
import com.hibernate.one_to_one_bi.dto.Pan;
import com.hibernate.one_to_one_bi.dto.Person;

public class PersonController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao dao = new PersonDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
		
		Person person = new Person();
		Pan pan = new Pan();
		pan.setPanNumber("9090909");
		pan.setPanAddress("Mijar");
		person.setPersonName("Amisha");
		person.setPersonEmail("a@gmail.com");
		//person.setPan(pan);
		pan.setPerson(person);
		dao.savePerson(person, pan);
		break;
		case 2: 
			Person p = dao.getById(2);
			System.out.println(p.getPersonId()+ "  "+p.getPersonName()+"  "+p.getPersonEmail());
			System.out.println(p.getPan().getPanId()+"  "+p.getPan().getPanNumber()+ "  "+p.getPan().getPanAddress());
		break;
		case 3:
			dao.deletePersonPan(3);
			break;
			
		case 4: 
			dao.updatePersonPan(3, "yyyy", "uuuu");
	}

}
}
