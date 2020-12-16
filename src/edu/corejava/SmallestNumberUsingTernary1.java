package edu.corejava;

public class SmallestNumberUsingTernary1 {
	public static void main(String[]args) {
		int num1 , num2 , num3 , result ;
		num1=20;
		num2=15;
		num3=25;
		result = (num1 < num2)?(num1 < num3 ? num1:num3):(num2 < num3 ? num2 : num3);
		System.out.println("smallest number among " + num1 + "," + num2 + "," + num3 + " is " + result );
		
	}

}
