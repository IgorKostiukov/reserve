package com.syntax.class13;

public class Hw3 {
public static void main(String[] args) {
	String a="Is it saturday? Is it raining? Do we have a Java Class today?";
	int count=0;
	int count2=0;
	for(int i=0;i<a.length();i++) {
		if (a.charAt(i) =='?' || a.charAt(i) =='!' || a.charAt(i) =='.' ) {
			String a1=a.substring(count2,i);
			count++;
			count2+=i;
			System.out.println(a1.replace("?","").trim()+"-- "+count+ " sentence");
		}
	}
	System.out.println("There is "+count+" sentences");
}
}
