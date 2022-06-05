package com.syntax.class04;

import java.util.Scanner;

public class ScannerHW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter last name");
		String lastName=sc.nextLine();
		System.out.println("Enter State");
		String state=sc.nextLine();
		System.out.println(name+" "+lastName+" "+state);
sc.close();
	}

}
