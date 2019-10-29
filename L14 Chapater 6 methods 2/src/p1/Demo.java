package p1;

import java.util.Scanner;

public class Demo {
	static String dashLine = "----------------------------";
	static Scanner kb = new Scanner(System.in);
	static int itemNumber;
	static int quantity;
	static double price;
	static String description;
	static double subtotal;

	public static void main(String[] args) {
		//step 1
		String serverName = getServerName();

		// step 2
		getTableNumber();

		// step 3 show menu to customers
		showMenuItems();

		// step 4 get order
		getOrder();

		// step 5 get item price and description
		getItemPriceAndDescription();
		
		// step 6 get subtotal
		getSubtotal();

		// step 7 get check
		showCheck();
	}
	
	public static void showCheck() {
		double TAX_RATE = 0.08625;
		String checkFormat = "%-4S%-10S%4d%10.2f\n";
		String checkDashLine = "----------------------------";
		showHeader();
		System.out.printf(checkFormat, "1.", description, quantity, subtotal);
		System.out.println(checkDashLine);
		System.out.printf("%-3S%25.2f\n", "TAX", subtotal * TAX_RATE);
		System.out.printf("%-8S%20.2f\n", "Total", (subtotal + (subtotal * TAX_RATE)));
		System.out.println(checkDashLine);
	}
	
	public static void getSubtotal() {
		subtotal = price * quantity;
	}
	
	public static void getItemPriceAndDescription() {
		
		if (itemNumber == 1) {
			price = 1.99;
			description = "Milk";
		} else if (itemNumber == 2) {
			price = 2.99;
			description = "O.J.";
		} else if (itemNumber == 3) {
			price = 1.99;
			description = "Water";
		} else if (itemNumber == 4) {
			price = 2.99;
			description = "Soda";
		} else if (itemNumber == 0){
			return;
		} else {
			price = 0.0;
			description = "None";
		}

	}
	
	public static void getOrder() {
		System.out.println("Enter the order by providing item number: ");
		itemNumber = kb.nextInt();
		System.out.println("Enter the quantity: ");
		quantity = kb.nextInt();
	}

	public static void showHeader() {
		System.out.println("       ABCD Restaurant");
		System.out.println("       123 Main Street");
		System.out.println("       Selden, NY 11784");
		System.out.println("        (631)123-4567");
		System.out.println(dashLine);
	}
	
	public static String getServerName() {
		// step 1 get server name
				
				System.out.println("Enter server's name: ");
				return kb.nextLine();
	}
	
	public static void getTableNumber() {
		// step 2 get table number
				System.out.println("Enter table number: ");
				int tableNumber = kb.nextInt();
	}
	
	public static void showMenuItems() {
		String menuItemFormat = "%-4S%-10S%10.2f\n";
		showHeader();
		System.out.printf(menuItemFormat, "1.", "Milk", 1.99);
		System.out.printf(menuItemFormat, "2.", "O.J", 2.99);
		System.out.printf(menuItemFormat, "3.", "Water", 1.99);
		System.out.printf(menuItemFormat, "4.", "Soda", 2.99);
		System.out.println(dashLine);
	}

}
