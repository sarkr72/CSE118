package get_user_input;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // prep work for getting kb input

		System.out.println("Enter two integers: "); // prompt user to enter data
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		System.out.println("The numbers entered are: " + number1 + " and " + number2);
		int number = number1 / number2;
		System.out.println("The quotient is : " + number);
		System.out.println("The remainder is: " + number1 % number2);
		input.nextLine();
		
//		System.out.println("Enter three names: ");
//		String names = input.nextLine();
//		System.out.println("The names are: " + names + ".");
//		String name1 = input.next();
//		String name2 = input.next();
//		String name3 = input.next();
//		System.out.println("Hi, " + name1 + " and " + name3);
		
//		
//		System.out.println("Enter two floating point numbers: ");
//		double num1 = input.nextDouble();
//		double num2 = input.nextDouble();
//		double number = num1 / num2;
//		System.out.println("The result is: " + number);
//		input.close();
	}

}
