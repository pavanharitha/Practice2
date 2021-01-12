package edu.corejava;

public class SumAndAverageUsingArray {
	public static void main(String[] args) {

		double[] numbers = { 19, 12.89, 16.5, 200, 13.7 };

		double sum = 0;
		double average = 0;

		System.out.println("Using for loop:");

		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];
		}

		System.out.println("sum of numbers is: " + sum);

		average = sum / numbers.length;
		System.out.println("average of numbers is:" + average);

	}

}
