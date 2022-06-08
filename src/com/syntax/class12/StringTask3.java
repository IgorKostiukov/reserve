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
	String girl=name1.substring(0,name1.length()/2);
	String boy=name2.substring(0,name2.length()/2);
	String girl1=name1.substring(name1.length()/2);
	String boy1=name2.substring(name2.length()/2);
	if (gender.equalsIgnoreCase("Girl")) {
		System.out.println("Maybe you should name her "+girl+boy1);
	}else {
		System.out.println("Maybe you should name him "+boy+girl1);
	}
	sc.close();
}
}
