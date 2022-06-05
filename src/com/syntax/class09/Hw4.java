package com.syntax.class09;

public class Hw4 {
public static void main(String[] args) {
	int a[] = {1,5,54,2};
	int sum=0;
	int sum2=0;
	for (int i:a) {
		
		sum+=i;
		
	}
	System.out.println("sum is " +sum);
	int i=0;
	while (i<a.length) {
		sum2+=a[i];
		i++;
	}
	System.out.println("sum is "+sum2);
}
}
