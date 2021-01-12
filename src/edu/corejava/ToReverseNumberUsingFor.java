package edu.corejava;

public class ToReverseNumberUsingFor {

	public static void main(String[] args) {

		int num = 12345, reversedNum = 0;

		for (; num != 0; num /= 10) {

			int digit = num % 10;

			reversedNum = reversedNum * 10 + digit;

		}
		System.out.println("Reversed num is " + reversedNum);
	}

}
