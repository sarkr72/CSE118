package p1_while_loop;

public class Demo {

	public static void main(String[] args) {
		int count = 0;
		
//		while (count < 5) { 
//			System.out.println("hi " + (count++));
//			System.out.println("count value is: " + count);
//			System.out.println();
//		}
		
		do {
			System.out.println("hi " + (count++));
			System.out.println("count value is: " + count);
			System.out.println();
		} while(count < 5);
		
	}

}
