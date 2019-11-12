package p1;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String[] names1 = { "Adam", "Bill", "Carl", "David", "Ellen" };
		showArray(names1);
		String[] names2 = new String[5];
		names2[4] = "Ellen";
		names2[0] = "Adam";
		names2[3] = "David";
		names2[1] = "Bill";
		names2[2] = "Carl";

		showArray(names2);

		int[] numbers = { 1, 2, 3, 4, 5 };
		int total = getTotal(numbers);
		System.out.println("The total is: " + total);
		showArray(numbers);
		showArray(names2, numbers);

		showNames(names1);
		String[] names = getNames(names1);
		System.out.println(Arrays.deepToString(names));

	}

	private static String[] getNames(String[] names1) {
		return names1;
	}

	private static void showNames(String[] names1) {
		System.out.println(Arrays.deepToString(names1));
	}

	private static int getTotal(int[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;
	}

	// overloaded methods
	private static void showArray(String[] names, int[] nums) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " " + nums[i]);
		}
	}

	private static void showArray(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}

	private static void showArray(String[] arr) {
		System.out.println(Arrays.deepToString(arr));
	}

}
