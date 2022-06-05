package com.syntax.class05;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your age");
	int age=sc.nextInt();
	sc.close();
	if(age>=18) {
		System.out.println("I'm issuing you a driver license");
	} else {
		System.out.println("You can only get a learners permit");
	}
				}

}
