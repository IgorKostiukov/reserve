package com.syntax.class14;

import java.util.Scanner;

public class MethodDemo {
	boolean inputNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string");
		String a=sc.nextLine();
		if(a.length()%2==0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		MethodDemo md=new MethodDemo();
		System.out.println(md.inputNum());
	}

}
