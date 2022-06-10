package com.syntax.class14;

public class Hw1 {
 int  comp(int a,int b) {
	 if( a>b) {
		 return a;
	 } else {
		 return b;
	 }
 }
public static void main(String[] args) {
	Hw1 md=new Hw1();
	System.out.println(md.comp(20, 15));
	
}
}
