package p1;

public class Demo {
	// public: access modifier
	// static: Only one copy of the method can be executed
	//void: there is no results will be returned
	// main: name of the method
	// (): inside are parameters -- determines
	// what type of data can be used as input of the method
	public static void main(String[] args) {
		// when a method is used, parameters are used as arguments
		String subtotal1 = showMenu("ABC",100, 5.5);
		System.out.println(subtotal1);
		String subtotal2 = showMenu("DEF", 200, 6.6);
		System.out.println(subtotal2);
		System.out.println("Done");
	}
	// parameters allows data to be passed between methods
	public static String showMenu(String name, int number, double price) {
		System.out.printf("%-6S", name);
		System.out.printf("%5d", number);
		System.out.printf("%10.2f\n", price);
		return name;
	}

}
