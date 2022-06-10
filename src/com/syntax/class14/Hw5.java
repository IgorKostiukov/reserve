package com.syntax.class14;

public class Hw5 {
	String createEmail(String name, String lastName,String mail) {
		String a=name+lastName+"@"+mail;
		return a;
	}
public static void main(String[] args) {
	Hw5 email=new Hw5();
	System.out.println(email.createEmail("Igor","Kostiukov","gmail.com"));
}
}
