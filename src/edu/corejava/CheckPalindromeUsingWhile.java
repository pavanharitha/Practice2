package edu.corejava;

public class CheckPalindromeUsingWhile {
	public static void main(String[] args) {
		int num = 121, reversedNum = 0, remainder, originalValue;
		originalValue = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;

			num /= 10;
		}
		if (originalValue == reversedNum)
			System.out.println(originalValue + " is a palindrome ");
		else
			System.out.println(originalValue + " is not a palindrome ");
	}

}
