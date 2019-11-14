package p1;

public class Demo {

	public static void main(String[] args) {
		int[] numbers1 = { 1, 2, 3, 4, 5 }; // one cabinet

		// an array of cabinets
		int[][] numbers2 = { { 1, 10000 }, { 2, 2, 2, 20000, 2, 3, 40000006, 5 }, { 3, 3, 3, 3, 4, 5 }, { 4 },
				{ 5, 5, 5, 5 } };
//		System.out.println(numbers2.length);
//		System.out.println(numbers2[4].length);

		for (int i = 0; i < numbers2.length; i++) { // outer loop, each i for a row
			for (int j = 0; j < numbers2[i].length; j++) { // inner loop, each j for a value in the row
				System.out.printf("%10d", numbers2[i][j]);
			}
			System.out.println();
		}

	}

}
