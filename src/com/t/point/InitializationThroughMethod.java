package com.t.point;

//   https://www.javatpoint.com/object-and-class-in-java
public class InitializationThroughMethod {

	public static void main(String[] args) {
		InitializationThroughMethod l = new InitializationThroughMethod();
		l.insertRecord(101, "i");
		l.displayInformation();

	}

	int rollNumber;
	String name;

	void insertRecord(int r, String n) {

		rollNumber = r;
		name = n;

	}

	void displayInformation() {

		System.out.println(rollNumber + " " + name);

	}

}
