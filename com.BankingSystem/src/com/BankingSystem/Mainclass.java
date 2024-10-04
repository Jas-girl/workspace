package com.BankingSystem;

import java.util.Scanner;

public class Mainclass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the choice for 1: saving account or 2:current account");
	int ch=sc.nextInt();
	
	if(ch==1) {
		SavingsAccount obj=new SavingsAccount();
		System.out.println("Account holder:"+obj.accountHolder);
		System.out.println("Account Number:"+obj.accountNumber);
		System.out.println("for saving account");

			System.out.println("Enter the Amount to Deposit");
			float amt=sc.nextFloat();
			obj.deposit(amt);

			System.out.println("Enter the Amount to Withdraw");
			float amt1=sc.nextFloat();
			obj.withdraw(amt1);

			
		
	}
	else if(ch==2) {
		
		CurrentAccount obj1=new CurrentAccount();
		System.out.println("Account holder:"+obj1.accountHolder);
		System.out.println("Account Number:"+obj1.accountNumber);
		System.out.println("for current account");
		
			System.out.println("Enter the Amount to Deposit");
			float amt2=sc.nextFloat();
			obj1.deposit(amt2);	
	
			System.out.println("Enter the Amount to Withdraw");
			float amt3=sc.nextFloat();
			obj1.withdraw(amt3);
	
		
	}
	else {
		System.out.println("no operation formed");
	}
	
	
	
	
	
}
}
