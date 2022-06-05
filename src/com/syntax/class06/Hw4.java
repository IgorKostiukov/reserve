package com.syntax.class06;

import java.util.Scanner;

public class Hw4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Are you selling?");
	String sale=sc.nextLine();
	
	switch(sale.toLowerCase()) {
	case "yes":
		System.out.println("Whitch item do you want to buy?");
	String item=sc.nextLine();
	System.out.println("what is it's price?");
	double price=sc.nextDouble();
	double price2=price;
	int disc;
	if(price<20) {
		disc=10;
		
	} else if (price>=20 && price<=100) {
		disc=20;
		
	} else if(price >=100 && price<=500) {
		disc=30;
		
	} else {
		disc=50;
		
	}
	price=(price/100)*disc;
	System.out.println("After discount of "+disc+"% the price of the "+item+" reduce from "+price2+"$ to "+price+"$");
	
		break;
	case "no":
		System.out.println("we're not going for shopping");
		break;
	}
	sc.close();
}
}
