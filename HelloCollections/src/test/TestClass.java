package test;

import java.util.ArrayList;
import java.util.Collections;


public class TestClass {

	public static void main(String[] args) {
		

				ArrayList<Student> arraylist = new ArrayList<>();
				
				Student s1 = new Student(3,"Pramod",2021);
				Student s2 = new Student(1,"Lucky",2022);
				Student s3 = new Student(2,"Autta",2020);
				Student s4 = new Student(4,"Dutta",2025);
				
				arraylist.add(s1);
				arraylist.add(s2);
				arraylist.add(s3);
				arraylist.add(s4);
				
				SordByYoj s = new SordByYoj();
				
				SordByName sortByName = new SordByName();
				
				SordById sortById = new SordById();
				
				
				Collections.sort(arraylist,sortById );
				
				System.out.println(arraylist.toString());
				
				for(Student ss: arraylist) {
					System.out.println("--");
					System.out.println(ss.getId());
					System.out.println(ss.getName());
					System.out.println(ss.getYoj());
				}
		
		
	}

}
