package com.syntax.class03;


public class PrimitivesCasting {

	public static void main(String[] args) {
		//ctrl+space autocomplits things 
		int i=100;
		double d=100; /*casting(widening or narrowing) is converting 1 type in another
						widening/implicit(automatic) casting convert small data type to bigger exmpl.: byte -> short
						narrowing/explicit(manual) casting convert big data type to smaller exmpl short-> byte
						*/
		System.out.println(i); //100
		System.out.println(d); //100.0
		//long l=10000; //storing int in long
		//byte b=130;
		int x=(int) 100.99;
		System.out.println(x);
		byte b= (byte)130;
		System.out.println(b);
	}
}
