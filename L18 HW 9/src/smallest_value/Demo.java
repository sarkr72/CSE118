package smallest_value;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		int[] intArr = createIntArray(MAX_SIZE);
		int smallest = getSmallest(intArr);
		System.out.println(Arrays.toString(intArr));
		System.out.println("The smallest: " + smallest);
		
		int largest = getLargest(intArr);
		System.out.println("The largest: " + largest);
		
		int total = getTotal(intArr);
		System.out.println("The total: " + total);
		
		double average = getAverage(intArr);
		System.out.println("The average: " + average);
		
	}

	private static double getAverage(int[] intArr) {
		int total = getTotal(intArr);
		double average = total * 1.0 / intArr.length;
		return average;
	}

	private static int getTotal(int[] intArr) {
		int total = 0;
		for(int i = 0; i < intArr.length; i++) {
			total += intArr[i];
		}
		return total;
	}

	private static int getLargest(int[] intArr) {
		int largest = intArr[0];
		for(int i = 1; i < intArr.length; i++) {
			if(largest < intArr[i]) {
				largest = intArr[i];
			}
 		}
		return largest;
	}

	private static int getSmallest(int[] intArr) {
		int smallest = intArr[0]; // assume the first value smallest
		for(int i = 1; i < intArr.length; i++) {
			if(smallest > intArr[i]) {
				smallest = intArr[i];
			}
		}
		return smallest;
	}

	private static int[] createIntArray(int max_size) {
		int[] numbers = new int[max_size];
		for(int i = 0; i < max_size; i++) {
			numbers[i] = (int)(Math.random() * 100);
		}
		return numbers;
	}

}
