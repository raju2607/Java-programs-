package com.ConsolbasedApplications;

import java.util.Scanner;

public class SupermarketBillingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		int productChoice;
		int quantity;

		double total = 0;
		double price = 0;
		double gst;
		double finalAmount;

		String product = "";

		do {

			System.out.println("\n======== SUPERMARKET BILLING SYSTEM ========");

			System.out.println("1. Fruits");
			System.out.println("2. Vegetables");
			System.out.println("3. Grocery Items");
			System.out.println("4. Dairy Products");
			System.out.println("5. Chicken");
			System.out.println("6. Seafood");
			System.out.println("7. Generate Final Bill");
			System.out.println("8. Exit");

			System.out.println("Enter Your Choice:");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("===== FRUITS =====");

				System.out.println("1. Apple - Rs.120/kg");
				System.out.println("2. Green Apple - Rs.120/kg");
				System.out.println("3. Pineapple - Rs.150/kg");
				System.out.println("4. Banana - Rs.100/kg");
				System.out.println("5. Orange - Rs.110/kg");
				System.out.println("6. Grapes - Rs.80/kg");
				System.out.println("7. Black Grapes - Rs.104/kg");
				System.out.println("8. Papaya - Rs.100/kg");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Apple";
					price = 120;
					break;

				case 2:
					product = "Green Apple";
					price = 120;
					break;

				case 3:
					product = "Pineapple";
					price = 150;
					break;

				case 4:
					product = "Banana";
					price = 100;
					break;

				case 5:
					product = "Orange";
					price = 110;
					break;

				case 6:
					product = "Grapes";
					price = 80;
					break;

				case 7:
					product = "Black Grapes";
					price = 104;
					break;

				case 8:
					product = "Papaya";
					price = 100;
					break;

				default:
					System.out.println("Invalid Fruit Choice");
					continue;
				}

				break;

			case 2:

				System.out.println("===== VEGETABLES =====");

				System.out.println("1. Tomato - Rs.40/kg");
				System.out.println("2. Potato - Rs.30/kg");
				System.out.println("3. Onion - Rs.50/kg");
				System.out.println("4. Carrot - Rs.60/kg");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Tomato";
					price = 40;
					break;

				case 2:
					product = "Potato";
					price = 30;
					break;

				case 3:
					product = "Onion";
					price = 50;
					break;

				case 4:
					product = "Carrot";
					price = 60;
					break;

				default:
					System.out.println("Invalid Vegetable Choice");
					continue;
				}

				break;

			case 3:

				System.out.println("===== GROCERY ITEMS =====");

				System.out.println("1. Rice - Rs.60/kg");
				System.out.println("2. Sugar - Rs.45/kg");
				System.out.println("3. Wheat - Rs.50/kg");
				System.out.println("4. Oil - Rs.150/litre");
				System.out.println("5. Salt - Rs.25/packet");
				System.out.println("6. Dal - Rs.120/kg");
				System.out.println("7. Tea Powder - Rs.200/packet");
				System.out.println("8. Coffee Powder - Rs.250/packet");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Rice";
					price = 60;
					break;

				case 2:
					product = "Sugar";
					price = 45;
					break;

				case 3:
					product = "Wheat";
					price = 50;
					break;

				case 4:
					product = "Oil";
					price = 150;
					break;

				case 5:
					product = "Salt";
					price = 25;
					break;

				case 6:
					product = "Dal";
					price = 120;
					break;

				case 7:
					product = "Tea Powder";
					price = 200;
					break;

				case 8:
					product = "Coffee Powder";
					price = 250;
					break;

				default:
					System.out.println("Invalid Grocery Choice");
					continue;
				}

				break;

			case 4:

				System.out.println("===== DAIRY PRODUCTS =====");

				System.out.println("1. Milk - Rs.30/litre");
				System.out.println("2. Curd - Rs.40/packet");
				System.out.println("3. Butter - Rs.55/packet");
				System.out.println("4. Cheese - Rs.100/packet");
				System.out.println("5. Paneer - Rs.120/packet");
				System.out.println("6. Ghee - Rs.250/packet");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Milk";
					price = 30;
					break;

				case 2:
					product = "Curd";
					price = 40;
					break;

				case 3:
					product = "Butter";
					price = 55;
					break;

				case 4:
					product = "Cheese";
					price = 100;
					break;

				case 5:
					product = "Paneer";
					price = 120;
					break;

				case 6:
					product = "Ghee";
					price = 250;
					break;

				default:
					System.out.println("Invalid Dairy Choice");
					continue;
				}

				break;

			case 5:

				System.out.println("===== CHICKEN =====");

				System.out.println("1. Chicken Curry Cut - Rs.240/kg");
				System.out.println("2. Chicken Boneless - Rs.320/kg");
				System.out.println("3. Chicken Breast - Rs.300/kg");
				System.out.println("4. Chicken Wings - Rs.220/kg");
				System.out.println("5. Chicken Drumsticks - Rs.280/kg");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Chicken Curry Cut";
					price = 240;
					break;

				case 2:
					product = "Chicken Boneless";
					price = 320;
					break;

				case 3:
					product = "Chicken Breast";
					price = 300;
					break;

				case 4:
					product = "Chicken Wings";
					price = 220;
					break;

				case 5:
					product = "Chicken Drumsticks";
					price = 280;
					break;

				default:
					System.out.println("Invalid Chicken Choice");
					continue;
				}

				break;

			case 6:

				System.out.println("===== SEAFOOD =====");

				System.out.println("1. Fish - Rs.200/kg");
				System.out.println("2. Prawns - Rs.350/kg");
				System.out.println("3. Crab - Rs.300/kg");
				System.out.println("4. Salmon - Rs.600/kg");
				System.out.println("5. Pomfret - Rs.450/kg");

				System.out.println("Enter Product Choice:");
				productChoice = sc.nextInt();

				switch (productChoice) {

				case 1:
					product = "Fish";
					price = 200;
					break;

				case 2:
					product = "Prawns";
					price = 350;
					break;

				case 3:
					product = "Crab";
					price = 300;
					break;

				case 4:
					product = "Salmon";
					price = 600;
					break;

				case 5:
					product = "Pomfret";
					price = 450;
					break;

				default:
					System.out.println("Invalid Seafood Choice");
					continue;
				}

				break;

			case 7:

				gst = total * 0.05;
				finalAmount = total + gst;

				System.out.println("\n========== FINAL BILL ==========");

				System.out.println("Subtotal: Rs." + total);
				System.out.println("GST (5%): Rs." + gst);
				System.out.println("Final Amount: Rs." + finalAmount);

				System.out.println("================================");

				break;

			case 8:

				System.out.println("Thank You! Visit Again.");

				break;

			default:

				System.out.println("Invalid Main Menu Choice");

				continue;
			}

			if (choice >= 1 && choice <= 6) {

				System.out.println("Enter Quantity:");
				quantity = sc.nextInt();

				if (quantity > 0) {

					double amount = price * quantity;

					total = total + amount;

					System.out.println("\n===== PRODUCT DETAILS =====");

					System.out.println("Product: " + product);
					System.out.println("Price: Rs." + price);
					System.out.println("Quantity: " + quantity);
					System.out.println("Amount: Rs." + amount);

					System.out.println("Product Added Successfully!");

				} else {

					System.out.println("Invalid Quantity");
				}
			}

		} while (choice != 8);

		sc.close();
	}
}
