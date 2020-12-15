package edu.corejava;

public class Area {
	public static void main(String[]args) {
		Area areaRectangle = new Area();
		areaRectangle.areaOfRectangle();
		Area squareArea = new Area();
		squareArea.areaOfSquare();
		double a=2.0;
		double b=3.0;
		double area=(a*b)/2;
		System.out.println("Area of Triangle : " +area);
	}
	public void areaOfRectangle() {	
		int a=3;
		int b=4;
		int area=(a*b);
	System.out.println("Area of Rectangle : " +area);

	}
	public void areaOfSquare() {
		int a=5;
		int area=(a*a);
		System.out.println("Area of Square : " +area);
	}
}
