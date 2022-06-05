package com.syntax.class08;

public class LoopPractise {
public static void main(String[] args) {
	int sum=0;
	int sum1=0,sum2=0;
	for (int i=1;i<=70;i++) {
		if(i%2==0) {
			sum1+=i;
		}else  {
			sum2+=i;
		}
		sum=sum1+sum2;
	}
	System.out.println("Even number: "+sum1);
	System.out.println("Odd number: "+sum2);
	System.out.println("Evene + Odd numberr: "+sum);
}
}
