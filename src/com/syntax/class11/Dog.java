package com.syntax.class11;

public class Dog {
String color;
int age;
void Bark() {
	System.out.println("Woof-woof");
}
void Sleep() {
	System.out.println("ZZzzzzZZZZzzz");
}
public static void main(String[] args) {
	Dog Husky=new Dog();
	Husky.age=3;
	Husky.color="Grey";
	Husky.Bark();
	Dog Bulldog=new Dog();
	Bulldog.age=6;
	Bulldog.color="Black";
	Bulldog.Sleep();
	Dog Labrador=new Dog();
	Labrador.age=1;
	Labrador.color="golden";
	if(Labrador.age<3) {
		System.out.println("Ohh, such a cute puppy");
		Labrador.Bark();
	}
}
}
