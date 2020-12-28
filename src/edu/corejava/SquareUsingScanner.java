package edu.corejava;

import java.util.Scanner;

public class SquareUsingScanner {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number , square ;
		
		System.out.println(" Enter an integer: ");
		
		number= sc.nextInt();
		
		square = number * number ;
		
		System.out.println(" The square of an integer " + number + " is: " + square);
		
		
	}

}
