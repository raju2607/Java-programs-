package com.logicalstatements;

import java.util.Scanner;

public class Studentsmarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks: ");
		int Marks = sc.nextInt();

		if (Marks >= 90 && Marks <= 100) {
			System.out.println(" Your Grade A");

		} else if (Marks >= 80) {
			System.out.println("our Grade B");

		} else if (Marks >= 70) {
			System.out.println("Your Grade C");

		} else if (Marks >= 60) {
			System.out.println("Your Grade D ");
		} else if (Marks <= 60) {
			System.out.println("Your are fail");
		}
		sc.close();

	}
}
