package com.niit.java.demo;

public class PrimeNumber {
	
	// x - 11
	// i - 2 , 3, 4, 5

	static boolean isPrime(int x) {

		// check whether x is divisible by 2, 3 ,4 ...x-1
	
		for (int i = 2; i < x/2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		
		System.out.println(isPrime(11));

	
	}

}
