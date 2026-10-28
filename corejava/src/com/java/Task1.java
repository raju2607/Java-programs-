package com.java;

public class Task1 {
	
	static String fooditeam1 ="chocolates";
	static String fooditeam ="cookies";
	static int chocolatesPrice = 15;
	static int  cookiesPrice = 10;
	static int totalcost = 450;
	
	

	public static void main(String[] args) {
		
		 int chocolates = 10;
	        int cookies = 5;
	        
	        int chocolates1 = chocolates* chocolatesPrice;
	        int cookies1 = cookies * cookiesPrice;
	         
	        
	        
	        int total =  chocolates1 + cookies1;
	        int remainingMoney = totalcost - total;
	        
            System.out.println("Total cost = 450");
	        System.out.println("Total cost = ₹" + total);
	        System.out.println("Remaining money = ₹" + remainingMoney);
	}

}
