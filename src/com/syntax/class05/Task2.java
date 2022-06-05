package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter day number");
		int a=sc.nextInt();
		sc.close();
		
		if(a>=1 && a<=5) {
			System.out.println("it's a weekday");
			
		} else if(a==6 || a==7) {
			System.out.println("it's a weekend");
		} else {
			System.out.println("Invalid day");
		}

	}

}
