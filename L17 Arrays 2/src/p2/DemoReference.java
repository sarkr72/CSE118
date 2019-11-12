package p2;

import java.util.Arrays;

public class DemoReference {

	public static void main(String[] args) {
		/* any array variables is reference type
		 * It is the memory address of the array that 
		 * is stored as value in the array variable
		 */
		
		String[] names = {"A", "B", "C", "D"}; 
		changeNames(names); // names is passed by value
		System.out.println(Arrays.deepToString(names));
	}

	private static void changeNames(String[] names2) {
		names2[0] = "Z";
//		System.out.println(Arrays.deepToString(names2));
	}

}
