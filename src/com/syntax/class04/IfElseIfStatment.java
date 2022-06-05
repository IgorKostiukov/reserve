package com.syntax.class04;

import java.util.Scanner;

public class IfElseIfStatment {
	public static void main(String[] args) {

		int a = 50, b = 50;
		if (a > b) {
			System.out.println(a + " is the larger than " + b);
		} else if (a < b) {
			System.out.println(b + " is the larger than " + a);
		} else {
			System.out.println(a + " is equal to " + b);
		}
		
Scanner sc= new Scanner(System.in);
int day=sc.nextInt();
sc.close();
	if(day==1)
	{
		System.out.println("Monday");

	}else if(day==2)
	{
		System.out.println("Tuesday");

	}else if(day==3)
	{
		System.out.println("Wednesday");

	}else if(day==4)
	{
		System.out.println("Thursday");

	}else if(day==5)
	{
		System.out.println("Friday");

	}else if(day==6)
	{
		System.out.println("Saturday");

	}else if(day==7)
	{
		System.out.println("Sunday");
	}

}
	
	}
