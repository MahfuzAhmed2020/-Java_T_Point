package com.t.point;

//83 https://www.youtube.com/watch?v=hvbCvpnvMaY&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=82
public class RealAccount {

	int acc_no, amount;
	String name;

	public static void main(String[] args) {
		RealAccount k = new RealAccount();
		k.info(123, "abrar", 1200);
		k.deposit(5000);
		k.withdrawl(5500);
		k.display();
	}

	void info(int a, String nm, int amt) {
		acc_no = a;
		amount = amt;
		name = nm;
		System.out.println("acc_no  = " + a + "    name= " + nm + "      amount  = " + amt);
	}

	void deposit(int amt) {
		amount = amount + amt;
		System.out.println("deposited  =" + amt + "\ntotal  = " + amount);
	}

	void withdrawl(int wdr) {
		if (amount < wdr) {
			System.out.println("Insufficient fund ");
		} else {
			amount = amount - wdr;
			System.out.println("withdrawl  =" + wdr);
			System.out.println("Balance  = " + amount);
		}

	}

	void display() {
		System.out.println("acc_no  = " + acc_no + "    name= " + name + "      amount  = " + amount);

	}

}
