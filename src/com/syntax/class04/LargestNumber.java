package com.syntax.class04;

import java.util.Scanner;

public class LargestNumber {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 distinct numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if (a>b) {
			if(a>c) {
				System.out.println("This is the largest number "+a);
			}
		}
		if (b>a) {
			if(b>c) {
				System.out.println("This is the largest number "+b);
			}
		}
		if (c>b) {
			if(c>a) {
				System.out.println("This is the largest number "+c);
			}
		}
	}

}
