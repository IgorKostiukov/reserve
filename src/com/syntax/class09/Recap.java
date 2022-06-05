package com.syntax.class09;

public class Recap {
public static void main(String[] args) {
	String [] disney= {"Shrek","Elsa","Goofy","Mulan"};
	System.out.println(disney[1]);
	for (int i=0;i<disney.length;i++) {
		System.out.println(disney[i]);
	}
	System.out.println("-----------------------");
	for(String i:disney) {
		if (i.equalsIgnoreCase("mulan")) {
			continue;
				
			}
		
		else {System.out.println(i);
	}
}
}
}