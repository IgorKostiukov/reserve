package com.syntax.class12;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "235432154123213";
		int counter = 0;
		int counter2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				counter++;
			} else if (str.charAt(i) == '3') {
				counter2++;
			}
		}
		System.out.println(counter);
		System.out.println(counter2);
		System.out.println(str.indexOf('4'));
	}
}
