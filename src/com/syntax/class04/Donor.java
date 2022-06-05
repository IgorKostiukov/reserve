package com.syntax.class04;

import java.util.Scanner;

public class Donor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
int age=sc.nextInt();
System.out.println("Enter weight");
int weight=sc.nextInt();
sc.close();
if(age>=18) {
	if(weight>=110) {
		System.out.println("You are eligible to donate your blood");
	} else {
		System.out.println("We can not accept your blood");
	}
}else {
	System.out.println("We can not accept your blood");
}
	}

}
