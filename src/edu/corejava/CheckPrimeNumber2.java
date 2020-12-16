package edu.corejava;

public class CheckPrimeNumber2 {
	public static void main(String[] args) {
		int numberToCheck = 31;
		boolean isPrime=false;
		for (int i=2; i<=numberToCheck/2; ++i) {
			if (numberToCheck % i == 0) {
				isPrime =true;
				break;
			}
			if (!isPrime)//! is written becoz isprime is mentioned as false in fst case//
				System.out.println(numberToCheck + " is a prime number ");
			else
				System.out.println(numberToCheck + " is not a prime number");

		}
	}
}
