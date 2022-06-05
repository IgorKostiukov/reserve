package com.syntax.class10;

public class Task2 {
public static void main(String[] args) {
	char[]  a= {'q','w','e','r','t','y'};
	char [] b= {' ',' ',' ',' ',' ',' '};
 for (char i:a)
 {
	 
	if (i==a[5]) {
		b[0]=i;
	} else if (i==a[4]) {
		b[1]=i;
	} else if (i==a[3]) {
		b[2]=i;
	} else if (i==a[2]) {
		b[3]=i;
	} else if (i==a[1]) {
		b[4]=i;
	}else if (i==a[0]) {
		b[5]=i;
	}	 	
		
	}
 for (int i=0; i<b.length;i++) {
	 System.out.print(b[i]+" ");
 }
}
}
