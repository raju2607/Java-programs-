package com.logicalstatements;

import java.util.Scanner;

public class AtmWithdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Balance = 10000;
		int CorrectPin = 6971;

		System.out.println(" Enter the Atm pin :");
		int Atm = sc.nextInt();
		if (Atm == CorrectPin) {
			System.out.println("Login Successfull");
			System.out.println("1. Check Current  Balance");
			System.out.println("2. Deposit the Amount");
			System.out.println("3. Withdraw the Amount");
			System.out.println("4. Exit ");
			System.out.println("Enter Your Choice");
			int Choice = sc.nextInt();
			if (Choice == 1) {
				System.out.println(" Your Current Balance is  :" + Balance);

			} else if (Choice == 2) {
				System.out.println("Enter Deposit Amount :");
				int amount = sc.nextInt();
				Balance = Balance + amount;
				System.out.println(" Deposit Succesfull");
				System.out.println("Your Balance is :" + Balance);

			} else if (Choice == 3) {
				System.out.println("Enter the Withdraw Amount :");
				int amount = sc.nextInt();
				if (amount <= Balance) {
					Balance = Balance - amount;
					System.out.println("Withdraw Successfull :");
					System.out.println("Current Balance : " + Balance);

				} else {
					System.out.println("Insuffient Funds!!");
				}
			} else if (Choice == 4) {
				System.out.println("Thank you for Using Atm ");
			} else {
				System.out.println("Invalid Choice");
			}
		} else {
			System.out.println("Invalid Pin");
		}
		sc.close();
	}
}
	
		 
	

		


