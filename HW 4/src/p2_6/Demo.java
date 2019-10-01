package p2_6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		int onesDigit = number % 10;
		int numberWithoutOnesDigit = number / 10;
		int tensDigit = numberWithoutOnesDigit % 10;
		int numberWithoutOnesAndTensDigits = numberWithoutOnesDigit / 10;
		int hundredsDigit = numberWithoutOnesAndTensDigits % 10;
		int answer = onesDigit * tensDigit * hundredsDigit;
		
		
		System.out.println("The multiplication of all digits in " 
				+ number + " is " + answer);
	}

}
