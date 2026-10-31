package com.ConsolbasedApplications;

import java.util.Scanner;

public class TrafficSignalMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Traffic Signal");
		String colour = sc.next();
		switch (colour) {
		case "red":
			System.out.println("Stop");
			break;

		case "yellow":
			System.out.println("Wait");
			break;

		case "green" :
			System.out.println("Go");
			break;

		default:
			System.out.println("Enter  colour is invalid");
		}
		sc.close();
	}

}
