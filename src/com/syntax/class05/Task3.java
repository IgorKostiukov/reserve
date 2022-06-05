package com.syntax.class05;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter number");
	int a=sc.nextInt();
	sc.close();
	if(a>=1 && a<=10) {
		System.out.println("The number is small");
	} else if (a>=11 && a<=100 ) {
		System.out.println("The number is medium");
	} else if (a>=101 && a<=1000) {
		System.out.println("The number is large");
	}
	
}
}
