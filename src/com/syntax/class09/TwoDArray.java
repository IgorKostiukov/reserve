package com.syntax.class09;

public class TwoDArray {
public static void main(String[] args) {
	int [] []a = {{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21},{22,23,24,25,26,27,28}};

	
	for (int i=0;i<4;i++) {
		for (int j=0;j<7;j++) {
		System.out.println( "a["+i+"]"+"[ "+j+"]= "+a[i][j]);
	}}
}
}
