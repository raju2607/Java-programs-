package com.logicalstatements;

import java.util.Scanner;

public class Naukariplatform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Hand on Experence in It : ");
		int Experence = sc.nextInt();

		if (Experence >= 5) {
			System.out.println("Senior Software Developer");

		} else if (Experence >= 3) {
			System.out.println("Software Developer");
		} else if (Experence >= 1) {
			System.out.println("Junior Software Developer");
		} else if (Experence >= 0) {
			System.out.println("Software Trainee");
		}
		sc.close();

	}

}
