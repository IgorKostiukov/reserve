package com.syntax.class09;

public class Task2 {
public static void main(String[] args) {
	String word[]= {"Java", "Saturday","day","coding","is"};
	System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	String[] word2=new String[5];
	word2[0]="Java";
	word2[1]="Saturday";
	word2[2]="day";
	word2[3]="coding";
	word2[4]="is";
	System.out.println(word2[1]+" "+word2[4]+" "+word2[0]+" "+word2[3]+" "+word2[2]);
	for(int i=0;i<word2.length;i++) {
	
		System.out.print(word2[i]+" ");
	}
	System.out.println();
	System.out.println("----------------------------------");
	String [] colors = {"pink","blue","white","black"};
	for(String i:colors) {
		if(i== colors[2]) {
			continue;
		} else {
		System.out.print(i+" ");
		}
	}
	System.out.println();
	int [] num= {10,20,30,40};
	for(int i :num) {
		if(i==num[2]) {
			
			continue;
		} else {
		System.out.print(i+" "); }
	}
	}
}

