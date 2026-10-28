package com.java;

public class Studentdetales {
	Integer studentId = 8369;
	String studentName = "Raju";
	Integer age = 22;
	Double marks = 85.5;
	Character grade = 'A';
	Boolean passes = true;
	private String passed;

	
	
 
	public static void main(String[] args) {
		 Studentdetales student = new Studentdetales();
		 System.out.println("Student Details");
	        System.out.println("--------------------");
	        System.out.println("Student ID   : " + student.studentId);
	        System.out.println("Student Name : " + student.studentName);
	        System.out.println("Age          : " + student.age);
	        System.out.println("Marks        : " + student.marks);
	        System.out.println("Grade        : " + student.grade);
	        System.out.println("Passed       : " + student.passed);

		

	}

}
