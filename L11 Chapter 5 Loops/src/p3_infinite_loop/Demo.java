package p3_infinite_loop;

public class Demo {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
			++count;
			if(count == 5) {
				continue;
			}
			
			if (count >= 10) {
				break;
			}
			System.out.println("hi " + count);
		}
		
//		int count = 0;
//		while (true) {
//			if (count >= 5) {
//				break;
//			}
//			System.out.println("Hi ");
//			count++;

//		}
//		int count = 0;
//		while (true) {
//			if (count < 5) {
//				System.out.println("hi");
//				count++;
//			} else {
//				break;
//			}
//		}
	}

}
