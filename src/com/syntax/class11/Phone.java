package com.syntax.class11;

public class Phone {
double screen;
int camera;
String battery;
String model;
void PowerOn() {
	System.out.println("Welcome to your phone!");
}
void PowerOff () {
	System.out.println("Bye-bye");
}
public static void main(String[] args) {
	Phone iphone= new Phone();
	iphone.screen=5.9;
	iphone.battery="32h";
	iphone.camera=2;
	iphone.model="10s";
	iphone.PowerOn();
	iphone.PowerOff();
	Phone Pixel=new Phone();
	Pixel.battery="46h";
	Pixel.model="google";
	System.out.println("Battery capacity of Pixel "+Pixel.model+" is "+Pixel.battery);
Phone Samsung=new Phone();
Samsung.camera=4;
Samsung.model="Flipper";
Samsung.screen=8.6;
Samsung.PowerOn();
System.out.println("This is Samsung model "+Samsung.model+" with screen size "+Samsung.screen+"inch");
}

}
