package com.syntax.class12;

public class StringTask {

	public static void main(String[] args) {
		
		String str="termometr";
		int middle=0;
		if (!str.isEmpty()) {
			if (str.length()%2==1 && str.length() >=3) {
				middle=(str.length()-1)/2;
				System.out.println(str.charAt(middle));
			}
		}
	}

}
