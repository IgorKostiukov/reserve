package com.syntax.class03;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
	
		double rate=4.5;
		if(rate>5) {
			System.out.println("I am not buying house");
		}
		else {
			System.out.println("I'm buying house");
		}
		int num1=99,num2=100;
		if(num1>num2) {
			System.out.println(num1+" is bigger than "+num2);
		}
Scanner sc= new Scanner(System.in);
int temp=sc.nextInt();
		if(temp>75) {
			System.out.println("I'll go for walk");
		}
		else {
			System.out.println("I'll study Java");
		}
		sc.close();
		System.out.println("----------Char---------------");
		char gender='m';
		if(gender=='f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");
		}
		System.out.println("-----------String-------------------");
		String browser="Chrome";
		if(browser.equals("chrome")) {
			System.out.println("Test cases executed in Chrome");
		} else {
			System.out.println("No test executed");
		}
	}

}
