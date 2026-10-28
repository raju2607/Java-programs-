package com.logicalstatements;

import java.util.Scanner;

public class Jerceynumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Jercey number");
		int Jercey = sc.nextInt();
		switch (Jercey) {
		case 7:
			System.out.println("MSD: Mahendra Singh Dhoni");
			System.out.println("Best caption");
			break;
		case 18:
			System.out.println("VK: virat kohli");
			System.out.println("Fire brand ");
			break;
		case 4:
			System.out.println("AB : Abhisheik Sharma");
			System.out.println("PULI : Aya Sher");
			break;

		default:
			System.out.println("Entered jercey number not avaiable in the above list of jersey number");
			sc.close();

		}
	}

}
