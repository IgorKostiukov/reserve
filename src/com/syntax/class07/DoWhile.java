package com.syntax.class07;

public class DoWhile {
	public static void main (String[] args) {
		int num=1;
		while(num<=3) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		System.out.println("-------------------");
		int num1=1;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=3);
	}
}
