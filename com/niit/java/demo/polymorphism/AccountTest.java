package com.niit.java.demo.polymorphism;

public class AccountTest {
	
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		DepositAccount da = new DepositAccount();
		CheckingAccount ca = new CheckingAccount();
		
		System.out.println( sa.getInterest(1000, 4));
		System.out.println( ca.getInterest(1000, 4));
		System.out.println( da.getInterest(1000, 4));
	}

}
