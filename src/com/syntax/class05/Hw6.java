package com.syntax.class05;

import java.util.Scanner;

public class Hw6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter quiz score");
	int a=sc.nextInt();
	System.out.println("Enter mid term score");
	int b=sc.nextInt();
	System.out.println("Enter final score");
	int c=sc.nextInt();
	sc.close();
	int av=(a+b+c)/3;
	if(av>=90) {
		System.out.println("your grade =A");
	} else if(av>=70 &&av<90)
	{
		System.out.println("your grade=B");
	} else if (av>=50 && av<70) {
		System.out.println("your grade=C");
	}else if (av<50) {
		System.out.println("your grade=F");
	}
}
}
