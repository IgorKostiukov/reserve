package com.syntax.class07;

public class WhileExamp {
public static void main(String[] args) {
	int d=20;
	while (d<=100) {
		
		if (d%2==0) {
			System.out.print(d+" ");
		}
		d++;
	}
	System.out.println();
	System.out.println("------------------------");
	
	
	int a=100;
	while (a>=1) {
		
		if (a%2==1) {
			System.out.print(a+" ");
		}
		a--;
	}
}
}
