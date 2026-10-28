package com.java;

public class Typeconverstion {

	public static void main(String[] args) {
		int  a1= 100;
		int doublevalue = a1;
		
		int intvalue = (int) doublevalue;
		char ch = 'A';
		int c1 = (int) ch;
	char ch1 = (char) c1;
        

        System.out.println("int to double : " + doublevalue);
        System.out.println("double to int : " + intvalue);
        System.out.println("char to int   : " + c1);
        System.out.println("int to char   : " + ch1);

	}

}
