package edu.corejava;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double number , squareRoot ;
		System.out.println(" Enter a number ");
		number = sc.nextDouble();
		squareRoot = Math.pow(number, 0.5);
		System.out.println(" The squareRoot of a giver number " + number + "is: " +squareRoot);
	}

}
