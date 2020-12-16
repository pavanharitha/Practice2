package edu.corejava;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int remainder;
		boolean isPrime = true;
		int checkNumber = 13;
		for (int i = 2; i <= checkNumber / 2; i++) {
			remainder = checkNumber % i;
			System.out.println(checkNumber + "divided by " + i + "leaves a remainder " + remainder);
			if (remainder == 0) {
				isPrime = false;
				break;
			}
			if (isPrime)
				System.out.println(checkNumber + "is a prime number");
			else
				System.out.println(checkNumber + "is not a prime number");
		}
	}
}
