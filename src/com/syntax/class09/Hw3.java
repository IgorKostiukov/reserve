package com.syntax.class09;

public class Hw3 {
public static void main(String[] args) {
	double a[]= new double[3];
	a[0]=2.4;
	a[1]=1.2;
	a[2]=44.2;
	for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for (double i:a) {
		System.out.print(i+" ");
	}
}
}
