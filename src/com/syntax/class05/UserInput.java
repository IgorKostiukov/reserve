package com.syntax.class05;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=sc.nextLine();
		System.out.println("Your name is "+name);
	
		System.out.println("Please enter age");
		int age=sc.nextInt();
		char a=sc.next().charAt(5);
		System.out.println("Your symbol is "+a);
		sc.close();
		String price[]= {"15", "12", "16"};
		if (age>14) {
		System.out.println(price[2]);
	}
	}

}
