package edu.corejava;

public class VowelOrConsonantUsingIfElse {
	
	public static void main(String[] args) {
		
		char ch = 'e';
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			
			System.out.println("The given char " + ch + " is a vowel ");
			
		} else {
			
			System.out.println("The given char " + ch + " is a consonant ");
		}
	}

}
