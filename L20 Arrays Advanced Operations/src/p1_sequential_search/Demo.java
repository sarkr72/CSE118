package p1_sequential_search;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {0, 4, 3, 2, 2, 1, 4, 5, 2, 1};
		System.out.println(Arrays.toString(sequentialSearch(numbers, 4)));
		
	}

	private static int[] sequentialSearch(int[] arr, int key) {
		int[] locationsFound = new int[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				locationsFound[count++] = i;
 			}
		}
//		System.out.println("The count is: " + count);
//		int[] shorterArray = new int[count];
//		for(int i = 0; i < count; i++) {
//			shorterArray[i] = locationsFound[i];
//		}
		int[] shorterArray = Arrays.copyOf(locationsFound, count);
		return shorterArray;
	}
}
