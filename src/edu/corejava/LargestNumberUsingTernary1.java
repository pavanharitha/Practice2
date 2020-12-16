package edu.corejava;

public class LargestNumberUsingTernary1 {
	public static void main(String[] args) {
		int num1 , num2 , num3 , result ;
		num1=10;
		num2=15;
		num3=20;
		result = (num1>num2)?
		         (num1>num3?num1:num3):
		         (num2>num3?num2:num3);
		         System.out.println("largest number among " + num1 + "," + num2 + "," + num3 + " is " + result);
	}

}
