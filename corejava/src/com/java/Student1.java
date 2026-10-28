package com.java;

public class Student1 {


    Integer StudentId = 8369;
    Double Marks = 95.5;
    Boolean passes = true;

    public static void main(String[] args) {
        Student1 s = new Student1();
        
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Student ID: " + s.StudentId);
        System.out.println("Marks: " + s.Marks);
        System.out.println("Pass Status: " + s.passes);

        int id = s.StudentId;
        double marks = s.Marks;
        boolean pass = s.passes;

        System.out.println("\nAfter Unboxing");
        System.out.println("----------------------");
        System.out.println("Student ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Pass Status: " + pass);
    }
}