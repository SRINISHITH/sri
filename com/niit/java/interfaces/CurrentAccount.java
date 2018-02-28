package com.niit.java.interfaces;





public class CurrentAccount extends AbstractAccount {

	
	public void openAccount() {
		System.out.println("Current account opend");
		
	}

	
	public void closeAccount() {
		System.out.println("Current account closed");
		
	}

	
	
	public void deposit(int amount) {
		System.out.println(amount + " withdraw from Current account ");
		
	}


	public void withdraw(int amount) {
		System.out.println(amount + "  deposited in Current account");
		
	}
	
	
	
	

}
