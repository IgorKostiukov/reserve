package com.syntax.class13;

public class Hw4 {
public static void main(String[] args) {
	String str="This is sentence i want to reverse";
	int count=0;
	for(int j=0;j<str.length();j++) {
		if(str.charAt(j)== ' ' || j==str.length()-1) {
			for (int i=j;i>=count;i--) {
				System.out.print(str.charAt(i));
			}
			count=j;
		}
	}
}
}
