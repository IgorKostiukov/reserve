package com.syntax.class05;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("What amount of loan do you need ?");	
			int loan=sc.nextInt();
			sc.close();
			if (loan<=200000 ) {
				System.out.println("I will lend you money");
			} else {
				System.out.println("Sorry i can't give you loan");
			}
	}

}
