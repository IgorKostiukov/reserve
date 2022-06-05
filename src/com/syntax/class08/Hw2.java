package com.syntax.class08;

import java.util.Scanner;

public class Hw2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter item you want to buy");
	String item=sc.next();
	System.out.println("Please enter price of item");
	int price=sc.nextInt();
int money=0; int pay=0; int change=0; int amount=0;
System.out.println("Please enter your payment");
	do {	
	money=sc.nextInt();
	amount+=money;
	pay=price-amount;
	
	if (amount>price) {
		change=amount-price;
		System.out.println("This is your change: "+change);
		System.out.println("Thank you for shopping! Here is your "+item);
		break;
	}else if(amount==price) {
		System.out.println("Thank you for shopping! Here is your "+item);
		break;
	}
	System.out.println("You need to pay this much now: "+pay);
	} while(amount<price);
	sc.close();
}
}
