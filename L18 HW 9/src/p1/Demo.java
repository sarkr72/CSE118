package p1;

import java.util.Arrays;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		String[] arr = new String[] {"A", "B", "C", "D"};
		shuffle(arr);
		System.out.println(Arrays.deepToString(arr));
	}

	private static void shuffle(String[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			Random rad = new Random();
			int newLocation = i + rad.nextInt(n - i);
			swap(arr, i, newLocation);
		}
	}

	private static void swap(String[] arr, int oldLocation, int newLocation) {
		String temp = arr[oldLocation];
		arr[oldLocation] = arr[newLocation];
		arr[newLocation] = temp;
	}
}
