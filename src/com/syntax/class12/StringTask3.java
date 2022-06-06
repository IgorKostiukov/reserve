package com.syntax.class12;

import java.util.Scanner;

public class StringTask3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Mom's first name");
	String name1=sc.next();
	System.out.println("Dad's first name");
	String name2=sc.next();
	System.out.println("Do you expect boy or a girl?");
	String gender=sc.next();
	if (gender.equalsIgnoreCase("Girl")) {
		System.out.println("Maybe you should name her Olivia");
	}else {
		System.out.println("Maybe you should name him Brian");
	}
	sc.close();
}
}
