package com.syntax.class08;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int secretnum=187;
	System.out.println("Hey! Guess a secret number");
	int guess=sc.nextInt();
	while(guess!=secretnum) {
		System.out.println("Wrong try again");
		guess=sc.nextInt();
	}
	System.out.println("You got it! secret number is: "+guess);
	sc.close();
}

}
