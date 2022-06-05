package com.syntax.classReview04;

import java.util.Scanner;

public class LoopReview {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number");
	int a=sc.nextInt();
	/*for (int i=0;i<=a;i+=2) {
		System.out.print(i+" ");
		
		if (i==10) {
			System.out.println("Value of b = "+b);
			break;
		}
	}*/
	int b=0;
	while (b<=a)
	{
		System.out.print(b+" ");
		b+=2;
		if (b==10) {
			System.out.println();
			System.out.println("Value of b= " +b);
			break;
	}
	
	}sc.close();

}
}
