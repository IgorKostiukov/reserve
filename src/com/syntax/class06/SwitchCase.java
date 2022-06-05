package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter day number");
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		String name;
		sc.close();
		switch (day) {
		case 1: 
			name="monday";
		break;
		case 2:
			name="Tuesday";
		break;
		case 3:
			name="Wednesday";
		break;
		case 4:
			name="Thursday";
		break;
		case 5:
		name="Friday";
		break;
		case 6:
			name="Saturday";
		break;
		case 7:
		name="Sunday";
		break;
		default:
			name="Invalid";
			break;
		}
		System.out.println(name);
	}

}
