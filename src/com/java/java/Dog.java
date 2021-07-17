package com.java.java;

public class Dog extends Animal {

	String color = "black";

	void printColor() {
		
		System.out.println("prints color of Dog class = " + color);// prints color of Dog class
		System.out.println("prints color of Animal class =  " + super.color);// prints color of Animal class
		System.out.println("prints color of Animal class =  " );// prints color of Animal class
		
	}

	public static void main(String args[]) {
		Dog d = new Dog();
		d.printColor();
	}
}
