package edu.corejava;

public class SumOfNaturalNumbersUsingDoWhile {
	public static void main(String[] args) {
		int naturalNumbers = 50;
		int sum = 0;
		int i = 1;
		do {
			sum += i; // sum = sum+i , assignment operators //

			i++;
		} while (i <= naturalNumbers);

		System.out.println(" Sum of natural numbers upto " + naturalNumbers + " are: " + sum);
	}

}
