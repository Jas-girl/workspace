package com.BankingSystem;

public class BankAccount {
	int accountNumber=123;
	String accountHolder="Aman";
	float balance;
	
	void deposit(float balance) {
		this.balance=balance;
		System.out.println("AccountHolder"+accountHolder+"has the balance:"+balance);
	}
	void withdraw(float balance) {
		this.balance=balance;
		System.out.println("AccountHolder"+accountHolder+"has the balance:"+balance);
	}
	void currentBalance(float balance) {
		 System.out.println("Current balance:"+balance);
	}
	
	
}
