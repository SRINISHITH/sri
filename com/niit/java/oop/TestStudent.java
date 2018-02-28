package com.niit.java.oop;

public class TestStudent {
	
	
	
	public static void main(String[] args) {
		//create instance of Student class
		//syntax
		//ClassName objectName = new ClassName()
		
		Student s1 = new Student();
		
		//first set/provide student number and then sname
		
		s1.setStudentNumber(101);
		s1.setStudentName("Anant");
		
		Student s2 = new Student();
		
		s2.setStudentNumber(102);
		s2.setStudentName("Vignesh");
		
		System.out.println(s1.getStudentNumber());
		
		System.out.println(s1.getStudentName());
		
		System.out.println(s2.getStudentNumber());
		System.out.println(s2.getStudentName());
		
		
				
		
	}

}
