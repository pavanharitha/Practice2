package edu.corejava;

public class LargestNumberUsingIfElse {
	public static void main(String[] args) {

		int n1 = 5, n2 = 10, n3 = 8, n4 = 9, n5 = 12;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

		else if (n2 >= n3 && n2 <= n4)
			System.out.println(n2 + " is the largest number.");

		else if (n3 >= n4 && n3 >= n5)
			System.out.println(n3 + " is the largest number.");

		else if (n4 >= n5 && n4 >= n1)
			System.out.println(n4 + " is the largest number.");

		else
			System.out.println(n5 + " is the largest number.");
	}

}
