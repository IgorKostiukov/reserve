package com.syntax.class10;

public class Array2dd {
public static void main(String[] args) {
	int [] [] nums= {{1,2,3,4},{10,20,30},{111,222,333,444,555,666}};
	for (int []i:nums) {
		for (int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
