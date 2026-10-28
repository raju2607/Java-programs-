package com.java;

public class StudentDemo {
		String Name ;
		int rollnumber;
		String course;
		
		int marks1;
		int marks2;
		int marks3;
		
		int sum ;
	
		
		void Student() {
			System.out.println(Name);
			System.out.println(rollnumber);
			System.out.println(course);
			
			
			
		}
		 
		 void totalMarks() {
			 int sum= marks1+marks2+marks3;
			 System.out.println(sum);
		 }
		
		 void  calculateAverage() {
			 float average = sum/3;
			 System.out.println(average);
			 
			 
			 
		 }
		
	

	public static void main(String[] args) {
	StudentDemo t = new StudentDemo();
	t.Name = "Raju";
	t.rollnumber = 8369;
	t.course = "java";
	
	t.marks1 = 90;
	t.marks2 = 86;
	t.marks1 = 60;
	
	t.Student();
	t.totalMarks();
		

	}

}
