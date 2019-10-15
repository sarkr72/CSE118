package p4_login;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String userName = "JohnDoe";
		String password = "Secret123";
		
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter user name: ");
			String uName = kb.nextLine();
			System.out.println("Enter password: ");
			String pWord = kb.nextLine();
			if (uName.equalsIgnoreCase(userName) && pWord.contentEquals(password)) {
				System.out.println("Success!");
				break;
			} else {
				System.out.println("Failure!");
			} 
		}
	}

}
