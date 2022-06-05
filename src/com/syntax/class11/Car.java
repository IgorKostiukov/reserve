package com.syntax.class11;

public class Car {

	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int NoOfDoors;
	int hp;
	void MoveForward() {
		System.out.println("Car is moving forward");
	}
	void reverse() {
		System.out.println("Moving backwards");
	}
	public static void main(String[] args) {
		Car bmw=new Car();
		bmw.model="X6";
		bmw.make="BMW";
		bmw.color="Black";
		bmw.year=2022;
		bmw.typeOfEngine="v8";
		bmw.hp=500;
		System.out.println(bmw.model);
		bmw.MoveForward();
		bmw.reverse();
		
		Car lexus = new Car();
		lexus.make="Toyota";
		lexus.color="Silver";
		lexus.year=2006;
		lexus.typeOfEngine="v6";
		lexus.NoOfDoors=5;
		System.out.println(lexus.make+" "+lexus.year);
	
	}
}
