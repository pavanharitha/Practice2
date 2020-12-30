package edu.corejava;

public class SumOfNaturalNumberUsingFor {
	public static void main(String[] args) {
		int naturalNumbers = 100;
		int sum = 0;
		for (int i = 1; i <= naturalNumbers; ++i) {
			sum += i; // sum = sum+i , assignment operators //

		}
		System.out.println(" Sum of natural numbers upto " + naturalNumbers + " are: " + sum);
	}

}
