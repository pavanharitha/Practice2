package edu.corejava;

public class ToCheckAlphabet {

	public static void main(String[] args) {

		char ch = '*';

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

			System.out.println(" Given char " + ch + " is an alphabet");
			
		} else {

			System.out.println(" Given char " + ch + " is not an alphabet");
		}
	}

}
