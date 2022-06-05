package com.syntax.class06;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to calculator");
		System.out.println("Please enter 2 numbers:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("Please enter opperator(+,-,*,/)");
		String op = sc.next();
		double res = 0;
		if (op.equals("+")) {
			res = a + b;
		} else if (op.equals("-")) {
			res = a - b;
		} else if (op.equals("*")) {
			res = a * b;
		} else if (op.equals("/")) {
			res = a / b;
		} else {
			System.out.println("Invalid operator");
		}
		sc.close();
		if (res != 0) {
			System.out.println("Result is " + res);
		} else {
			System.out.println(res);
		}
	}
}
