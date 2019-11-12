package p1_intro;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] x = {5, 10, 10, 10};
//		System.out.println(Arrays.toString(x));
//		x[0] = 10;
//		System.out.println(Arrays.toString(x));
//		System.out.println(x.length);
		
		for(int i = 0; i < x.length; i++) {
			x[i] = x[i] * 2;
			if(x[i] == 20) {
				x[i] = 100;
			}
		}
		System.out.println(Arrays.toString(x));
		
//		double[] y = {5.5, 6.5, 7.5, 8.5};
//		String[] name = {"Joey", "Billy", "Suzy"};
//		x[0] = 10;
//		System.out.println(x);
	}

}
