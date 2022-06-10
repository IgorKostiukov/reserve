package com.syntax.class14;

public class Hw6 {
	String prime(int a) {
		String str="Prime";
		
		if (a<=1) {
			str="Not prime";
			return str;
		} else {
			for (int i=2;i<=a/2;i++) {
				if (a%i==0) {
					str ="Not prime";
					break;
				}
			}
			return str;
		}
	}
public static void main(String[] args) {
	Hw6 check=new Hw6();
	System.out.println(check.prime(23));
}
}
