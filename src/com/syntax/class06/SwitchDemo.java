package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
	char choice='Y';
String meaning="null";
switch(choice) {
case 'Y':
	meaning="Yes";
	break;
case 'M':
	meaning="Maybe";
	break;
case 'N':
	meaning="No";
	break;
}
System.out.println(meaning);
	}
}
