package edu.corejava;

public class ReverseNumberOnlyOdd {
	public static void main(String[] args) {

		int num = 12345;

		int reversedNum = 0;

		while (num != 0) {

			int digit = num % 10;
			if (digit % 2 != 0) {

				reversedNum = reversedNum * 10 + digit;
		}

		num /= 10;
		
	}

		System.out.println("The given number reversed only odd : " + reversedNum);

	}

}
