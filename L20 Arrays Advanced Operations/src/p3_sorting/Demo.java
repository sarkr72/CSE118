package p3_sorting;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 4, 20, 3, 0, 5, 1};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void sort(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int currentSmallest = numbers[i];
			int indexSmallestFound = i;
			for(int j = i+1; j < numbers.length; j++) {
				if(currentSmallest > numbers[j]) {
					currentSmallest = numbers[j];
					indexSmallestFound = j;
				}
			}
			swap(numbers, i, indexSmallestFound);
		}
	}

	private static void swap(int[] numbers, int i, int indexSmallestFound) {
		int temp = numbers[i];
		numbers[i] = numbers[indexSmallestFound];
		numbers[indexSmallestFound] = temp;
	}

}
