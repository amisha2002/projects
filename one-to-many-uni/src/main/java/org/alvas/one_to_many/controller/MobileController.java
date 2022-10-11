package org.alvas.one_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.one_to_many.dao.MobileDao;
import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;


public class MobileController {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Sim sim1 = new Sim();
		Sim sim2 = new Sim();
		MobileDao dao = new MobileDao(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			sim1.setName("VI");
			sim1.setProvider("Vodafone");
			sim2.setName("JIO");
			sim2.setProvider("Reliance");
			
			List<Sim> sim = Arrays.asList(sim1,sim2);
			mobile.setName("Realme");
			mobile.setModel("RM130");
			mobile.setSim(sim);
			dao.saveMobileSim(mobile, sim1, sim2);
			break;
		case 2:
			dao.deleteMobileSim(4);
			break;
		case 3:
			Mobile mobile1 = dao.getById(4);
			System.out.println("Mobile details");
			System.out.println(mobile1.getId()+ "   "+mobile1.getName()+"  "+mobile1.getModel());
			System.out.println("Sim details");
			for (Sim sim3 : mobile1.getSim()) {
				System.out.println(sim3.getId()+ "  " +sim3.getName()+ "  "+sim3.getProvider());
			}
			
			
			break;
		case 4:
			dao.updateMobileSim(4, "mi", "Ryy");
			break;
		}

	}

}
