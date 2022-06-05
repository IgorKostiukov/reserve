package com.syntax.class06;

import java.util.Scanner;

public class Hw1 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your country");
String country=sc.nextLine();
String lang;
switch(country.toLowerCase()) {
case "ukraine":
	lang="Ukrainian";
	break;
case "usa":
	lang="English";
	break;
case "mexico":
	lang="Spanish";
	default:
		lang="unknown";
}
sc.close();
System.out.println("Your language is "+lang);
}
}
