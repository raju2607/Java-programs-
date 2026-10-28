package com.logicalstatements;

import java.util.Scanner;

public class Employeedetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====== Employee Details");

        System.out.println("Enter the employee Name:");
        String Name = sc.nextLine();

        System.out.println("Enter the Employee Id:");
        int EmployeeId = sc.nextInt();

        System.out.println("Enter the Phone Number:");
        long PhoneNumber = sc.nextLong();

        System.out.println("Enter Age:");
        int Age = sc.nextInt();

        System.out.println("Enter Salary Of employee:");
        Double salary = sc.nextDouble();

        System.out.println("\n===== EMPLOYEE INFORMATION =====");

        System.out.println("Employee ID: " + EmployeeId);
        System.out.println("Employee Name: " + Name);
        System.out.println("Employee Phone Number: " + PhoneNumber);
        System.out.println("Employee Age: " + Age);
        System.out.println("Employee Salary: " + salary);

        sc.close();
    }
}
