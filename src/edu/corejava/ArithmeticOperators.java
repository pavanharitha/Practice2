package edu.corejava;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;
		System.out.println("num1+num2:" + (num1 + num2));
		System.out.println("num1-num2:" + (num1 - num2));
		System.out.println("num1*num2:" + (num1 * num2));
		System.out.println("num1\num2:" + (num1 / num2));
		System.out.println("num1%num2:" + (num1 % num2));
		ArithmeticOperators arOperators = new ArithmeticOperators();
		arOperators.operators();
		arOperators.operator1(300, 400);
		ArithmeticOperators2 obj = new ArithmeticOperators2();
		obj.operators2(100, 200);
	}

	public  void operators() {
		int number1 = 50;
		int number2 = 20;
		System.out.println(number1 + number2);

	}

	public void operator1(int a, int b) {

		System.out.println(a + "," + b);
	}
}

class ArithmeticOperators2 {
	public void operators2(int a, int b) {
		System.out.println(a + "," + b);
	}

}
