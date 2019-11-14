package p2_binary_search;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] numbers = {0, 2, 4, 6, 9, 11, 13, 20, 30, 32, 100};
		System.out.println(binarySearch(numbers, 50));
		
	}

	private static int binarySearch(int[] numbers, int key) {
		int low = 0;
		int high = numbers.length-1;
		int mid;
		while (high >= low) {
			mid = (low + high)/2;
			if(numbers[mid] == key) {
				return mid;
			} else if(numbers[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
