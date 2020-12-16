package edu.corejava;

public class SmallestNumberUsingTernary {
	public static void main(String[]args) {
		int num1 , num2 , num3 , temp , result ;
		num1=20;
		num2=15;
		num3=25;
		temp = (num1<num2)?num1:num2;
		result = (temp<num3)?temp:num3;
		System.out.println("smallest number among " + num1 + "," + num2 + "," + num3 + " is " + result );
		
	}

}
