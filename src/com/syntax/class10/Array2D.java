package com.syntax.class10;

public class Array2D {
public static void main(String[] args) {
	int [] [] number=new int[3][4];
	number [0] [0] = 10;
	number [0] [1] = 20;
	number [0] [2] = 30;
	number [0] [3] = 40;
	number [1] [0] = 1;
	number [1] [1] = 2;
	number [1] [2] = 3;
	number [1] [3] = 4;
	number [2] [0] = 9;
	number [2] [1] = 8;
	number [2] [2] = 7;
	number [2] [3] = 6;
	System.out.println(number[0].length);
	System.out.println("--------------------");
	for(int i=0;i<3;i++) {
		for (int j=0;j<4;j++) {
			System.out.print(number [i][j]+" ");
		}
	}
}
}
