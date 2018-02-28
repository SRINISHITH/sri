package com.niit.java.demo.polymorphism;

public class Account {
	
	int getInterest(int amount, int duration)
	{
		//4% for SavingAccount and Current Account
		
		return amount*duration*4/100;
	}

}
