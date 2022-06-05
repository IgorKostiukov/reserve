package com.syntax.class02;

public class Variables {
	public static void main(String[] args) {
		String name="Asel";
		String lastname="Umurzakova";
		char grade='A';
		String city="New York";
		String state="New York";
		String phnumber="555-653-4526";
		
		System.out.println("My name is "+name+" and my last name is "+lastname);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phnumber);
		city="Panama City Beach";
		state="Florida";
		phnumber="636-458-7887";
		System.out.println("My name is "+name+" and i moved to new city "+city+" and new state "+state+".My new phone number is "+phnumber);
		/*
		 * Rules for identifiers
		 * 1. no space
		 * 2. no keywords
		 * 3. can't start with numbers(can be anywhere elese)
		 * 4.cannot have special character(except _ and $)
		 * example: String for="heelo";
		 * int 1number=100;
		 * int num%=20;
		 */
	}

}
