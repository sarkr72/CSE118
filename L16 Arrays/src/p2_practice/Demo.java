package p2_practice;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];  // same as total = total + numbers[i]
		}
//		total /= 5; // total = total / 5;
		System.out.println("The total is: " + total);
		
//		for(int i = 0; i < 10; i++) {
//			numbers[i] = numbers[i] * 2;
//		}
		
//		numbers[4] = 1000; // change the 5th numbere to 1000
		
//		for(int i =4; i< numbers.length; i++) { //double 5th to the last
//			numbers[i] = numbers[i] * 2;
//		}
		
//		for(int i = numbers.length-1; i >= 0; i--) {
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
		
//		for(int i = numbers.length-1; i >= 0; i=i-2) {
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
		
//		System.out.println(Arrays.toString(numbers));
	}

}
