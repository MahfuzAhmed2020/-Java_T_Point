package com.t.point;
//83 https://www.youtube.com/watch?v=hvbCvpnvMaY&list=PLgH5QX0i9K3oAZUB2QXR-dZac0c9HNyRa&index=82
//  https://www.javatpoint.com/object-and-class-in-java
public class RealWorldAccount {
public static void main(String[] args) {
	RealWorldAccount k=new RealWorldAccount();
	k.insert(989898, "mahfuz", 500);
	
	
	k.display();
	//k.checkBalance();
	k.withdraw(100);
	//k.deposit(500);
	}
	//Java Program to demonstrate the working of a banking-system  
	//where we deposit and withdraw amount from our account.  
	//Creating an Account class which has deposit() and withdraw() methods  
	 int acc_no;  
	String name;  
	float amount;  
	//Method to initialize object  
	void insert(int a,String n,float amt){  
	acc_no=a;  
	name=n;  
	amount=amt;  
	System.out.println("account_number : "+a+"  name : "+n+"   amount : "+amt);
	}  
	//deposit method  
	void deposit(float amt){  
	amount=amount+amt;  
	System.out.println("$"+amt+" deposited"); 
	System.out.println("total = "+amount);
	}  
	//withdraw method  
	void withdraw(float amt){  
	if(amount<amt){  
	System.out.println("Insufficient Balance");  
	}else{  
	amount=amount-amt;  
	System.out.println(amt+" withdrawn"+" and new balance = "+amount);  
	}  
	}  
	//method to check the balance of the account  
	void checkBalance(){System.out.println("Balance is: "+amount);}  
	//method to display the values of an object  
	void display(){System.out.println(acc_no+" "+name+" "+amount);}  
	}  
	//Creating a test class to deposit and withdraw amount 
	
	
	
	
	
	
	

