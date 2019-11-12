package p3_arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = new int[10]; // new operator
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
