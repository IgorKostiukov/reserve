package com.syntax.class10;

public class Task {
public static void main(String[] args) {
	int [] a= {2,4,4,9,3,-1};
	int b=a[0];
	for (int i:a) {
		if (i>b) {
			b=i;
		}
	}
	System.out.println("The largest number is "+b);
}
}
