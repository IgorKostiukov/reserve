package com.syntax.class05;

import java.util.Scanner;

public class Hw4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter time 24h format");
	
	int time=sc.nextInt();
	sc.close();
	if (time>=1 && time <=11) {
		System.out.println("it's morning");
	} else if (time>=12 && time <=15) {
		System.out.println("its' Afternoon");
	} else if (time>=16 && time <=20) {
		System.out.println("it's Evening");
	} else if (time>=21 && time <=24) {
		System.out.println("it's night");
	}
			
}
}
