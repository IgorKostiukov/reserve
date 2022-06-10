package com.syntax.class14;

import java.util.Scanner;

public class Hw7 {
	char getGrade () {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter score");
		int a=sc.nextInt();
		sc.close();
		char grade='A';
	
		if(a>90) {
			return grade;
		}else if (a>80) {
			grade='B';
			return grade;
		} else if (a>70) {
			grade='C';
			return grade;
			
		}else if (a>50) {
			grade='D';
			return grade;
		} else {
			grade='F';
			return grade;
		}
		
		
	}
public static void main(String[] args) {
	Hw7 score=new Hw7();
	System.out.println(score.getGrade());
}
}
