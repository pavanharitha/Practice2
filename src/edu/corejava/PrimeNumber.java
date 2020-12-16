package edu.corejava;

public class PrimeNumber {
	public static void main(String[] args) {
		int limit = 150;// taken n  number as 150//
		
		System.out.println(" prime numbers between 1 and " + limit);
		for (int i=1; i<150; i++) {
			boolean isPrime = true;
			for (int j=2; j<i; j++) {

				if (i % j == 0) {// if a number divisible by other is not prime//
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(i + "");
		}
	}
}
