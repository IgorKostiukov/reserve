package com.syntax.class08;

import java.util.Scanner;

public class Hw {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.println("Please enter 2 numbers that will create a range");
	int range1=sc.nextInt();
	int range2=sc.nextInt();
	//System.out.println("Now enter numbers:");
	int sum1=0,sum2=0,sum3=0;
for (int i=range1; i<=range2;i++){
	
	if(i==0) {
		continue;
	}
	if(i%2==0) {
		 sum1+=i;
	} else  {
		sum2+=i;
	}
	
	}
sum3=sum1+sum2;
System.out.println("Sum of even numbers: "+sum1);
System.out.println("Sum of Odd numbers: "+sum2);
System.out.println("This is sum of even and odd uintegers: " +sum3 );
sc.close();
}
}
