package com.ConsolbasedApplications;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Price = 0;
		int total;
		int  grandTotal=0;
		char yn;
		do {
			String Item = "";
			System.out.println("========Food Menu=========");
			System.out.println("1. Pizza - Rs.200");
			System.out.println("2. Burger - Rs.120");
			System.out.println("3. Biryani - Rs.180");
			System.out.println("4. Noodles - Rs.100");
			System.out.println("Enter Your Choice");
			int Choice = sc.nextInt();
			switch (Choice) {
			case 1:
				Item = "Pizza";
				Price = 200;
				break;
			case 2:
				Item = "Burger";
				Price = 120;
				break;
			case 3:
				Item = "Biryani";
				Price = 180;
				break;
			case 4:
				Item = "Noodles";
				Price = 100;
			default:
				System.out.println("Enter Item Unavalible ");
				break;

			}
			System.out.println("Enter The Quantity");
			int Quantity = sc.nextInt();
			total = Price * Quantity;
			grandTotal = grandTotal + total;
			System.out.println("======Bill Details=====");
			System.out.println("Selected Item :" + Item);
			System.out.println("Item Price : Rs." + Price);
			System.out.println("Quantity" + Quantity);
			System.out.println("Total Bill: Rs." + total);

			System.out.println("Do You Want To Order Again (Y/N)");
			yn = sc.next().charAt(0);

		} while (yn == 'Y' || yn == 'y');

		System.out.println("====== Final Bill ======");
		System.out.println("grand Total: Rs." + grandTotal);
		System.out.println("Thank You! Visit Again.");

		sc.close();

	}

}
