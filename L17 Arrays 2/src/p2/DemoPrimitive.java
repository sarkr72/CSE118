package p2;

public class DemoPrimitive {

	public static void main(String[] args) {
		int x = 5;
		// You are using a method below that is already made
		doubleIt(x); // x is an argument. It is always passed by value, not by name
		System.out.println("The x is: " + x);
	}

	// whenever writing a method, you are just designing it, not using it
	private static void doubleIt(int y) { //"int y" is called parameter
		y *= 2;
		System.out.println(y);
	}

}
