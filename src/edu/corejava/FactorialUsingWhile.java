package edu.corejava;

public class FactorialUsingWhile {

	public static void main(String[] args) {

		int factorial = 6;
		long fact = 1;
		int i = 1;
		while (i <= factorial) {

			fact = fact * i;

			i++;

		}
		System.out.println(" factorial of given number  " + factorial + " is : " + fact);
	}

}
