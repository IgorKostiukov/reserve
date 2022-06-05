package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String apply=" ";
		do {
			System.out.println("Do you want to apply for credit card?");
			apply=sc.nextLine();
		} while(!"yes".equalsIgnoreCase(apply));
		sc.close();
	}
}

