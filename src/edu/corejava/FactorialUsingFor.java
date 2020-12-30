package edu.corejava;

public class FactorialUsingFor {
	public static void main(String[] args) {
		int factorial = 5;
		long fact = 1;
		for (int i = 1; i <= factorial; ++i) {
			
			fact = fact * i;

		}
		System.out.println(" factorial of given number  " + factorial + " is : " + fact);
	}

}
