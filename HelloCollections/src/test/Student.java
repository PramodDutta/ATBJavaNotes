package test;

import java.util.Comparator;


class SordByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SordByYoj implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		 if(o1.yoj > o2.yoj) {
			 return 1;
		 }
		 
		 if(o1.yoj < o2.yoj) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
		
	}
	
}

class SordById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		 if(o1.id > o2.id) {
			 return 1;
		 }
		 
		 if(o1.id < o2.id) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
		
	}
	
}



public class Student implements Comparable<Student>{
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYoj() {
		return yoj;
	}
	public void setYoj(Integer yoj) {
		this.yoj = yoj;
	}
	Integer id;
	String name;
	Integer yoj;
	
	
	public Student(Integer id, String name, Integer yoj) {
		this.id = id;
		this.name = name;
		this.yoj = yoj;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", yoj=" + yoj + "]";
	}
	@Override
	public int compareTo(Student studentobject) {
		// TODO Auto-generated method stub
		return this.yoj-studentobject.yoj;
	}

	

}
