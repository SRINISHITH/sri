package com.niit.java.interfaces;

public class DepositAccount  extends  AbstractAccount{

	@Override
	public void getBalance()
	{
		System.out.println("getting the balance from deposit account");
	}

	public void openAccount() {
		System.out.println(" Deposit account opened");
		
	}

	
	public void closeAccount() {
		System.out.println(" Deposit account closed");
		
	}


	public void withdraw(int amount) {
		System.out.println(amount +" widthdraw fromDeposit account ");
		
	}

	
	public void deposit(int amount) {
		if(amount>5000)
		{
			amount = amount - 100;
		}
		System.out.println(amount +" deposited in Deposit account ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
