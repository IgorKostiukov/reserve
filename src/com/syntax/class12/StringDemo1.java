package com.syntax.class12;

public class StringDemo1 {
	public static void main(String[] args) {
		String userName = "admin";
		String password = "pass123222";
		String confirmPassword = "pass123222";
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");

		} else if (!password.contains(confirmPassword)) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}
		int counter=0;;
		for (int i = 0; i < password.length(); i++) {
			if ('s' == password.charAt(i)) {
				counter++;

			}
		}
		System.out.println(counter);
	}
}
