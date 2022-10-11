package com.hibernate.many_to_one.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.hibernate.many_to_one.dao.CollegeDao;
import com.hibernate.many_to_one.dto.Building;
import com.hibernate.many_to_one.dto.College;

public class CollegeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeDao dao = new CollegeDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			College college = new College();
			Building building1 = new Building();
			Building building2 = new Building();

			college.setCollegeName("Alvas2");
			college.setCollegeAddress("Mijar2");

			building1.setBuildingName("Sundari2");
			building1.setBuildingColor("Red2");
			building1.setCollege(college);

			building2.setBuildingName("Anand2");
			building2.setBuildingColor("Orange2");
			building2.setCollege(college);

			dao.saveBuildingCollege(college, building1, building2);
		case 2:
			dao.deleteBuildingCollege(4);
			break;
		}
	}

}
