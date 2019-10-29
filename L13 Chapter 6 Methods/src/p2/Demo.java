package p2;

import java.util.Scanner;

public class Demo {
	static int x = 10000;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two numbers separated by a space");
		double num1 = kb.nextDouble();
		double num2 = kb.nextDouble();
//		double sum = add(num1, num2);
//		System.out.println("The sum is: " +sum);
		System.out.println("The sum is: " + add(num1, num2));
		System.out.println("The difference is: " + subtract(num1, num2));
		System.out.println("The product is: " + multiply(num1, num2));
		System.out.println("The quotient is: " + divide(num1,num2));
		System.out.println(x);
	}
	private static double add(double n1, double n2) {
		System.out.println(x);
		return n1 + n2;
	}
	// scope of variables
	private static double subtract(double n1, double n2) {
		System.out.println(x);
		return n1 - n2;
	}
	
	private static double multiply(double n1, double n2) {
		System.out.println(x);
		return n1 * n2;
	}
	
	private static double divide(double n1, double n2) {
		System.out.println(x);
		return n1 / n2;
	}
	

}
