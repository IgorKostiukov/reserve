package com.syntax.class05;

import java.util.Scanner;

public class Hw2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter city");
	String city=sc.nextLine();
	System.out.println("Please enter tempreture");
	int temp=sc.nextInt();
	sc.close();
	
int cels;
cels=(temp-32)*5/9;
System.out.println("The temperature int the city "+city+" is "+cels);
}
}
