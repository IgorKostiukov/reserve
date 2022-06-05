package com.syntax.class06;

import java.util.Scanner;

public class Hw3Pt2 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Welcome to calculator");
	System.out.println("Please enter 2 numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Please enter opperator(+,-,*,/)");
	String op=sc.next();
	int res=0;
	switch(op) {
	case "+":
		res=a+b;
		break;
	case "-":
		res=a-b;
		break;
	case "*":
	res=a*b;
	break;
	case "/":
		res=a/b;
		break;
		default:
			System.out.println("Invalid operator");
	
	}
	sc.close();
	if(res!=0) {
	System.out.println("Result is "+res);
} else {
	System.out.println(res);
}
	}

}
