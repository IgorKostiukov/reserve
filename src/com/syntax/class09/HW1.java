package com.syntax.class09;

public class HW1 {
public static void main(String[] args) {
	String cars [] = {"Lexus","BMW","KIA","Opel","Honda","Mazda"};
	for (int i=0;i<cars.length;i++) {
		System.out.print(cars[i]+" ");
	}
	System.out.println();
	for (String i: cars) {
		System.out.print(i+" ");
	}
	
}
}
