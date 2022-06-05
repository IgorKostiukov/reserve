package com.syntax.class09;

public class Hw2 {
public static void main(String[] args) {
	String [] animals = {"monkey","horse","jaguar","cat","dog"};
	for (String i: animals) {
		System.out.print(i+" ");
	}
	System.out.println();
	int i=0;
	while(i<animals.length) {
		System.out.print(animals[i]+" ");
		i++;
	}
}
}
