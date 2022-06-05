package com.syntax.classReview02;
import java.util.Scanner;
public class StringConCat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter age");
		int age=sc.nextInt();
		sc.close();
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println(age+name+" Whateever he meant");

	}

}
