	package com.syntax.classReview05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String [] names = new String[5];
	for(int i=0;i<names.length;i++) {
	names[i]=sc.next();
	;}
	System.out.println(Arrays.toString(names));
}
}
