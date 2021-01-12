package edu.corejava;

public class LargestNumberUsingArray {
	public static void main(String[] args) {

		double[] numbers = { 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 };
		double largest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (largest < numbers[i])
				largest = numbers[i];
		}

		System.out.println("largest number is:" + largest);
	}
}
