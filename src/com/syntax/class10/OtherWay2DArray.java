package com.syntax.class10;

public class OtherWay2DArray {
public static void main(String[] args) {
	String [] [] usa= {
			{"New York","Albany","Buffalo"},
			{"Los Angeles","San Francisco","San Jose","San Diego","Redding"},
			{"Miami","Orlando","Niceville","Tampa"},
			{"McLean","Richmond","Leesburg"}
			};
	System.out.println(usa[1][2]);
	System.out.println(usa.length);
	System.out.println(usa[0].length);
	System.out.println("------------------");
	for (int i=0;i<usa.length;i++) {
		
		for (int j=0;j<usa[i].length;j++) {
			System.out.println(usa[i][j]);
		}
	}
	for (String [] i:usa) {
		for (String j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
