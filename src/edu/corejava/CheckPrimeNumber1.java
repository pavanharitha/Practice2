package edu.corejava;

public class CheckPrimeNumber1 {
	public static void main(String[] args) {
		CheckPrimeNumber1 primeNumber = new CheckPrimeNumber1();
		primeNumber.primeNumber();
		int numberToCheck = 23;
		boolean isPrime = true;
		for (int i = 2; i <= numberToCheck / 2; i++) {
			if (numberToCheck % i == 0) {
				isPrime = false;
				break;
			}
			if (isPrime)
				System.out.println(numberToCheck + " is a prime number ");
			else
				System.out.println(numberToCheck + " is not a prime number");

		}
	}
	public void primeNumber() {
		int numberToCheck = 29;
		boolean isPrime = true;
		for (int i = 2; i <= numberToCheck / 2; ++i) {
			if (numberToCheck % i == 0) {
				isPrime = false;
				break;
			}
			if (isPrime)
				System.out.println(numberToCheck + " is a prime number ");
			else
				System.out.println(numberToCheck + " is not a prime number");

	}
	}
}
