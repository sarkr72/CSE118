package p5_guessNumber;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 11);
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numberEntered = kb.nextInt();
		
		if(numberEntered == number) {
			System.out.println("Success!");
		} else if (numberEntered > number){
			System.out.println("Number entered is too big!");
		} else {
			System.out.println("Number entered is too small!");
		}
		
	}

}
