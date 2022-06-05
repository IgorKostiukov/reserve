package com.syntax.class04;

import java.util.Scanner;

public class Largest2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	sc.close();
	if(a>b) {
		System.out.println("Largest number is "+a);
	}else {
		System.out.println("Largest number is "+b);
	}
	}

}
