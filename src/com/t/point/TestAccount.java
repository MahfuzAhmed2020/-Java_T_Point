package com.t.point;

import java.util.Scanner;

public class TestAccount {
	static int b[] = { 1312, 255, 50, 565, 845, 192 };

	public static void main(String[] args) {
//		RealWorldAccount m = new RealWorldAccount();
//		m.insert(792932, "ABRAR", 50000);
//		m.withdraw(20000);

		reverseSentence();

	}

	public static void reverseSentence() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		String sentence = input.nextLine();
		String[] word = sentence.split("");
		String reverse = "";
		for (int i = word.length - 1; i >= 0; i--) {
			// System.out.println(reverse);
			reverse = reverse + word[i];
			
		}System.out.println(reverse);

	}

}
