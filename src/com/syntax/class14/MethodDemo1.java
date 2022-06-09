package com.syntax.class14;

public class MethodDemo1 {
	void print (int a,String str) {
		for (int i=0;i<a;i++) {
			System.out.println(str);
		}
	}
public static void main(String[] args) {
	MethodDemo1 md=new MethodDemo1();
	md.print(5,"lol");
}
}
