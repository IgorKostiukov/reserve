package com.syntax.class14;

public class Hw3 {
	boolean pali(String str) {
		StringBuilder bd=new StringBuilder(str);
		bd.reverse();
		String a=bd.toString();
		
		if(a.equalsIgnoreCase(str)) {
			return true;
		}
		else {
			return false;
		}
	}
public static void main(String[] args) {
	Hw3 word =new Hw3();
	System.out.println(word.pali("racecar"));
}
}
