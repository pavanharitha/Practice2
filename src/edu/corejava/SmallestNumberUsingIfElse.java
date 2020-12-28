package edu.corejava;

public class SmallestNumberUsingIfElse {
	public static void main(String[] args) {

		int n1 = 5, n2 = 10, n3 = 13, n4 = 2, n5 = 12;

		if (n1 <= n2 && n1 >= n3)
			System.out.println(n1 + " is the smsllest number.");

		else if (n2 <= n3 && n2 <= n4)
			System.out.println(n2 + " is the smallest number.");

		else if (n3 <= n4 && n3 <= n5)
			System.out.println(n3 + " is the smallest number.");

		else if (n4 <= n5 && n4 <= n1)
			System.out.println(n4 + " is the smallest number.");

		else
			System.out.println(n5 + " is the smallest number.");
	}

}
