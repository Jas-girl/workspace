package com.BankingSystem;


public class SavingsAccount extends BankAccount {
	float savingAmt=10000;
	@Override
   void deposit(float balance) {
		this.balance=balance;
	  System.out.println("Depoist:"+this.balance);
	  currentBalance(savingAmt+balance);
  }
  void withdraw(float amt) {
	
	  System.out.println("Withdraw:"+amt);
	  this.balance=balance-amt;
	  float totalAmt=savingAmt+this.balance;
	  currentBalance(totalAmt);
	  if(totalAmt>=savingAmt) {
		  System.out.println("transition successfull");
	  }
	  else {
		  System.out.println("transition not successfull");
	  }
	  
  }
}
