package p2_13;

import java.util.Scanner;

public class Ex2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double monthlyAmount = input.nextDouble();
		double amountAfterMonth1 = monthlyAmount * (1 + 0.003125);
		System.out.println("After the first month, the account value is " + 
				amountAfterMonth1);
		double amountAfterMonth2 = (monthlyAmount + amountAfterMonth1) * (1 + 0.003125);
		System.out.println("After the second month, the account value is " 
				+ amountAfterMonth2);
	}

}
