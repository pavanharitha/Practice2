package edu.corejava;

public class EvenOrOdd {
	public static void main(String[]args) {
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		evenOrOdd.checkEvenOdd();
		int num=5;
		if(num%2==0)
		System.out.println(num + "is even");
		else
			System.out.println(num + "is odd");
		
	}
	public void checkEvenOdd() {
		int num=6;
		if(num%2==0)
		System.out.println(num + "is even");
		else
			System.out.println(num + "is odd");
	}

}
