package com.ConsolbasedApplications;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ConnectionType;
		int Units;
		int rate = 0;
		int TotalBill = 0;
		System.out.println("======== Electricity Bill calculation");
		System.out.println("1. Domestic");
		System.out.println("2.Commercial");
		System.out.println("Enter The Connection Type");
		 ConnectionType = sc.nextInt();
		System.out.println("Enter The Units consumed");
		int Units1 = sc.nextInt();
		if (Units1 < 0) {
			System.out.println("Invalid Units");
			sc.close();
			return;
		}
		switch (ConnectionType) {
		case 1: {
			if (Units1 <= 100) {
				rate = 2;
			} else if (Units1 <= 300) {
				rate = 2;
			} else {
				rate = 3;
			}
			TotalBill = Units1 * rate;

			break;
		}
		case 2: {
			if (Units1 <= 100) {
				rate = 4;
			} else if (Units1 <= 300) {
				rate = 6;
			} else {
				rate = 8;
			}
			TotalBill = Units1 * rate;

			break;
		}
		default:
			System.out.println("Invalid Connection Type!");
			sc.close();
			return;

		}
		System.out.println(" ElectricityBill");
		System.out.println("Connection Type:" + ConnectionType);
		System.out.println("Units Consumed :" + Units1);
		System.out.println("Rate Per Unit  :" + rate);
		System.out.println("Total Electricity Bill :" + TotalBill);
		sc.close();

	}

}
