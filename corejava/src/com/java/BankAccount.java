package com.java;

public class BankAccount {
	static int balance = 1000;
     void  deposit() {
		int amount = 500;
		balance = balance + amount;
		System.out.println("deposit :"  +balance);
		
	}
	void withdraw() {
		int amount = 200;
		balance = balance - amount ;
		System.out.println("withdraw :" + balance);

		
				
	}
	void display() {
		System.out.println("Balance is : "  + balance);
	}

	public static void main(String[] args) {
		BankAccount b1 =  new BankAccount();
		b1.deposit();
		b1.withdraw();
		b1.display();
		
		
			
		
		
		}

			}
		

	


