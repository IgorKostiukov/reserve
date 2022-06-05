package com.syntax.class09;

public class Task1 {
public static void main(String[] args) {
	char grade[]= {'A','B','C','D','E','F'};
	System.out.println("Grade is " + grade[1]);
	char[] grade2=new char[6];
	grade2[0]='A';
	grade2[1]='B';
	grade2[2]='C';
	grade2[3]='D';
	grade2[4]='E';
	grade2[5]='F';
	System.out.println("Grade is "+grade2[1]);
	for(int i=0;i<grade2.length;i++) {
		System.out.print(grade2[i]+" ");
}
}
}