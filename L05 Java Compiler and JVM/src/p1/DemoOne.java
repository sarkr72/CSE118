package p1;

public class DemoOne {

	public static void main(String[] args) {
//		System.out.println("Name:" + "\t\tJohn\tJoe\tJulie");
//		System.out.println();
//		System.out.println(5 * 1.0 / 2 + " is the answer.");
		System.out.printf("%-10S%15s%10s%10s", "Name", "Phone", "Age", "GPA");
		System.out.println("\n----------------------------------------");
		System.out.printf("%-10S%15s%10s%10.2f", "John", "(631)123-4567", "20", 4.000000);
	}

}
