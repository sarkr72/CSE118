package p3;

public class Demo {

	public static void main(String[] args) {
		String line = "----------------------------";
		String format1 = "%-5s%10s\t\t$%4.2f\n";
		System.out.println(line);
		System.out.printf(format1, "1.", "Tea", 2.99);
		System.out.printf(format1, "2.", "Milk", 1.99);
		System.out.printf(format1, "3.", "O.J.", 3.99);
		System.out.println(line);
	}

}
