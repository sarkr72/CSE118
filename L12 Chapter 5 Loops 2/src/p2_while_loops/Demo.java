package p2_while_loops;

public class Demo {

	public static void main(String[] args) {
		int i = 0;
		do { 
			i++;
			if(i == 4) {
				continue;
			}
			System.out.println("hi");
			
		}while(i == 3);
		System.out.println("done!");
	}

}
