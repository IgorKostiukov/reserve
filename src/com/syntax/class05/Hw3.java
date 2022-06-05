package com.syntax.class05;

import java.util.Scanner;

public class Hw3 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of worked years");
	int a=sc.nextInt();
	System.out.println("Enter annual salary");
	int b=sc.nextInt();
	sc.close();
	if (a>=5) {
		System.out.println("you're eligible for the bonus");
	if (b>50000) {
		System.out.println("Bonus is 5000");
	} else {
		System.out.println("Bonus is 3000");
	}
	} else {
		System.out.println("You're not eligible for the bonus");
	}
}
}
