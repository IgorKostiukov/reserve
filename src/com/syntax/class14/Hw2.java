package com.syntax.class14;

public class Hw2 {
	String  OddOrEven(int a) {
		
		if(a%2==0) {
			return "Even";
		} else {return "Odd";}
	}
public static void main(String[] args) {
	Hw2 md=new Hw2();
	System.out.println(md.OddOrEven(5));
}
}
