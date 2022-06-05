package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter heights in inches");
	int height=sc.nextInt();
	sc.close();
	if (height<60) {
		System.out.println("short");
	}
	else if( height>=60 && height <=72) {
		System.out.println("medium");
	}
	else if(height>72) {
		System.out.println("tall");
	}
}
}
