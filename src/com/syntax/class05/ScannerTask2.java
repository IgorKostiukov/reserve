package com.syntax.class05;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you have a credit card?");
		String crcd=sc.nextLine();
		if(crcd.equalsIgnoreCase("Yes")) {
			System.out.println("What is the balance in your card?");
		int balance=sc.nextInt();
		sc.close();
		if (balance>1000) {
			System.out.println("You need to pay off this amount immediiatly: " + balance);
		} else {
			System.out.println("You can spend more");
		}
		}else if(crcd.equalsIgnoreCase("No")) {
			System.out.println("I can offer you a good credit card");
		}
	}

}
