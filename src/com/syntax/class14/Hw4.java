package com.syntax.class14;

public class Hw4 {
	void hello (String str) {
		if ("Ukraine".equalsIgnoreCase(str)) {
			System.out.println("Pryvit");
		} else if ("USA".equalsIgnoreCase(str)) {
			System.out.println("Hello");
		} else if ("China".equalsIgnoreCase(str)) {
			System.out.println("Nihao");
		}
	}
public static void main(String[] args) {
	Hw4 hi=new Hw4();
	hi.hello("ukraine");
}
}
