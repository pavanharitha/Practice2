package edu.corejava;

public class VowelOrConsonantUsingSwitch {
	public static void main(String[] args) {
		char ch = 'k';
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("given char " + ch + " is a vowel ");
			break;
		default:
			System.out.println(" given char " + ch + " is a consonant ");
		}
	}

}
