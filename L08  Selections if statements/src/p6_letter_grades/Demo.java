package p6_letter_grades;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your test score: ");
		int testScore = input.nextInt();

		String letterGrade;
		if (testScore >= 90) {
			letterGrade = "A";
		} else if (testScore >= 85) {
			letterGrade = "B+";
		} else if (testScore >= 80) {
			letterGrade = "B";
		} else if (testScore >= 75) {
			letterGrade = "C+";
		} else if (testScore >= 70) {
			letterGrade = "C";
		} else if (testScore >= 65) {
			letterGrade = "D+";
		} else if (testScore >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		System.out.println("Your letter grade is: " + letterGrade + ".");
	}

}
