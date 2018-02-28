package com.niit.java.interfaces;

public class TestAccount {
	public static void main(String[] args) {
		
		DepositAccount da = new DepositAccount();
		CurrentAccount ca = new CurrentAccount();
		
		da.openAccount();
		da.deposit(6000);
		da.withdraw(1000);
		da.closeAccount();
		da.getBalance();
		
		ca.openAccount();
		ca.deposit(5000);
		ca.withdraw(2000);
		ca.closeAccount();
		ca.getBalance();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
