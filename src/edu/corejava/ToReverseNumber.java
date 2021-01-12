package edu.corejava;

public class ToReverseNumber {
	public static void main(String[] args) {

		int num = 1234;

		int reversedNum = 0;

		while (num != 0) {

			int digit = num % 10;

			reversedNum = reversedNum * 10 + digit;

			num /= 10;
		}
		System.out.println("The given number reversed as: " + reversedNum);

	}
}
