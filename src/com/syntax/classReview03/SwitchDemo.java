package com.syntax.classReview03;

import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String country=sc.nextLine();
	String cap="";
	sc.close();
	switch (country.toLowerCase()) {
	case "turkey":
		cap="Astana";
		break;
	case "usa":
		cap="DC";
		break;
	case "serbia":
		cap="Belgrad";
		break;
	case "afghanistan":
		cap="KAbul";
		break;
	case "albania":
		cap="Tirana";
		break;
	case "aakistna":
		cap="Islamabad";
		break;
		default:
			cap="Not a valid country";
	}
	System.out.println(cap);
}


}
