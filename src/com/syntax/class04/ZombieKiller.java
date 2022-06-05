package com.syntax.class04;
import java.util.Scanner;
public class ZombieKiller {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Welcome to our zomibe killer program! Enter type of zombie");
		String zombie=sc.nextLine();
		sc.close();
		String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
		String zombies[] = {"Close-range zombie", "Mid range zombie", "Long range zombie"};
		if(zombie.equals("Close-range")) {
			System.out.println("For "+zombies[0]+" best weapon is "+backpack[0]);
		} else {
		System.out.println("There is no zombie like that");
		}
		
		
		
		

	}

}
