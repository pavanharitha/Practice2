package edu.corejava;

public class AreaOfTriangle {
public static void main(String[]args) {
	AreaRectangle areaRectangle = new AreaRectangle();
	areaRectangle.areaOfRectangle();
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
}
