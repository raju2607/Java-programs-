package com.logicalstatements;

import java.util.Scanner;

public class PostiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("The Number is Postive");
		} else if (num < 0) {
			System.out.println("The Number is Negative ");
		} else {
			System.out.println("Zero");
		}
		sc.close();

	}

}
