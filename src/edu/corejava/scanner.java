package edu.corejava;

import java.util.Scanner;

public class scanner {
	public static void main(String [] args) {
		int num , square ;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter an integer: ");
		num = sc.nextInt();
		System.out.println(" Square of " + num + " is: " + Math.pow(num, 2));
		
	}

}
