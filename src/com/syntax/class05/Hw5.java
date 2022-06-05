package com.syntax.class05;

import java.util.Scanner;

public class Hw5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter birth month");
	String date=sc.nextLine();
	sc.close();
	if ( date.equalsIgnoreCase("January") || date.equalsIgnoreCase("February") || date.equalsIgnoreCase("December"))
	{
		String season="Winter";
		
		System.out.println("You were born in "+season);
	}
	if ( date.equalsIgnoreCase("March") || date.equalsIgnoreCase("April") || date.equalsIgnoreCase("May"))
	{
		String season="Spring";
	
		System.out.println("You were born in "+season);
	}
	if ( date.equalsIgnoreCase("June") || date.equalsIgnoreCase("July") || date.equalsIgnoreCase("August"))
	{
		String season="Summer";
		
		
		System.out.println("You were born in "+season);
	}
	if ( date.equalsIgnoreCase("September") || date.equalsIgnoreCase("October") || date.equalsIgnoreCase("November"))
	{
		String season="Autumn";
	
		System.out.println("You were born in "+season);
	}

}
}
