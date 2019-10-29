package p3_Palindrome;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string to check for Palindrome: ");
		String str = kb.nextLine();

		int low = 0;
		int high = str.length() - 1;
		
		boolean isPalindrome = true;
		
		char lowChar;
		char highChar;
		while (true) {
			lowChar = str.charAt(low);
			highChar = str.charAt(high);
			if(lowChar == highChar) {
				low++;
				high--;
			} else {
				isPalindrome = false;
				break;
			}
			if(low > high) {
				break;
			}
		}
		
		
		System.out.println("Is it a palindrome? " + isPalindrome);
		

	}

}
