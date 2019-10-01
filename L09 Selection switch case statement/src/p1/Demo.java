package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int letterGrade = input.nextInt();
		
		switch (letterGrade) {
		case 1:
//			System.out.println("You got 90 or higher.");
//			break;
		case 2:
//			System.out.println("You got 85 or higher." );
//			break;
		case 3:
//			System.out.println("You got 80 or higher.");
//			break;
		case 4:
			System.out.println("You got 4 or lower.");
			break;
		case 5:
//			System.out.println("You got 70 or higher.");
//			break;
		case 6:
//			System.out.println("You got 65 or higher." );
//			break;
		case 7:
//			System.out.println("You got 60 or higher.");
//			break;
		case 8:
			System.out.println("You got between 5 and 8.");
			break;
		default:
			System.out.println("No such letter grade!");
		}
	}

}
