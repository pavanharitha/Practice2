package edu.corejava;

public class SumOfNaturalNumbersUsingWhile {
	public static void main(String[] args) {
		int naturalNumbers = 50;
		int sum = 0;
		int i = 1;
		while (i <= naturalNumbers) {

			sum += i; // sum = sum+i , assignment operators //

			i++;

		}
		System.out.println(" Sum of natural numbers upto " + naturalNumbers + " are: " + sum);
	}

}
