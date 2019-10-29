package p1_for_loops;

public class Demo {

	public static void main(String[] args) {
		int n = 6;
		int m = 0;
		
//		if (n < 5) {
//			m = 100;
//		} else {
//			m = 200;
//		}
//		m = (n < 5) ? 100 : 200;
		
//		System.out.println(m);
		int i;
		for (i = 0; i < 5; i = i + 2) {
			System.out.println("hi");
			if (i == 3) {
				continue;
			}
			System.out.println("bye");
		}
		System.out.println("The i value is: " + i);
	}

}
