package edu.corejava;

public class Perimeter {
	public static void main(String[]args) {
		Perimeter perimeterRectangle = new Perimeter();
		perimeterRectangle.perimeterOfRectangle();
		Perimeter perimeterSquare = new Perimeter();
		perimeterSquare.perimeterOfSquare();
		int a=2;
		int b=3;
		int c=5;
		int perimeter=(a+b+c);
		System.out.println("Perimeter of Triangle : " +perimeter);
	}
	public void perimeterOfRectangle() {	
		int a=3;
		int b=4;
		int perimeter=2*(a+b);
	System.out.println("perimeter of Rectangle : " +perimeter);

	}
	public void perimeterOfSquare() {
		int a=5;
		int perimeter=4*(a);
		System.out.println("perimeter of Square : " +perimeter);
	}

}
