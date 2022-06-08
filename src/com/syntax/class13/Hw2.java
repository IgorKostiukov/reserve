package com.syntax.class13;

public class Hw2 {
public static void main(String[] args) {
	String str="qweqwsafas1231241242@!#%$#%^";

		String str2=str.replaceAll("[^A-Za-z0-9]","");
			System.out.println(str2.length());
		
	}
}

