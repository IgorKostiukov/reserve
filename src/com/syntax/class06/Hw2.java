package com.syntax.class06;

import java.util.Scanner;

public class Hw2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your grade");
	String grade=sc.nextLine();
	String res;
	switch(grade.toLowerCase()) {
	case "a" :
		res="Excellent";
		break;
	case "b":
		res="Good";
		break;
	case "c":
		res="Average";
		break;
	case "d":
		res="Bad";
		break;
		default:
			res="Not Acceptable";
	}
	sc.close();
	System.out.println("Your grade is "+res);
}
}
