package p1;

import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] numbers3 = new int[4][6];
		int total = 0;
		for(int i = 0; i < numbers3.length; i++) {
			int subtotal = 0;
			for(int j = 0; j < numbers3[i].length;j++) {
				numbers3[i][j] = rand.nextInt(10); // assign random value
				subtotal += numbers3[i][j]; // add the random value to subtotal
				System.out.printf("%2d", numbers3[i][j]); // print each element
			}
			System.out.printf("%10d", subtotal);
			total += subtotal; // add subtotal to total
			System.out.println();// go to next row to start a new row
		}
		System.out.printf("%22d", total);
	}

}
