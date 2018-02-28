package com.niit.java.demo;

public class MyNumber {
	
	
	//given number is even or not
	//x=10
	//
	static boolean isEven(int x)
	{
		if(x%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
	System.out.println(	isEven(10) );
	}

}
