package p1_characters;

public class Demo {

	public static void main(String[] args) {
//		char letter1 = 'a';
//		char letter2 = 'a';
//		System.out.println(letter1 + letter2);
//		System.out.println((char)(65 +(int) (Math.random() * 26))); //A:65 --> Z:90
//		System.out.println((char)(97 +(int) (Math.random() * 26))); //a:97 --> z:122
//		System.out.println((int)(Math.random() * 10));
//		
//		char upperCaseLetter = (char)(65 +(int) (Math.random() * 26));
//		char lowerCaseLetter = (char)(97 +(int) (Math.random() * 26));
//		int digit = (int)(Math.random() * 10);
//		
//		System.out.println(String.valueOf(upperCaseLetter) 
//							+ String.valueOf(lowerCaseLetter) 
//							+ digit);
//		
//		System.out.println("" + upperCaseLetter + lowerCaseLetter + digit);
		
//		System.out.println("John says, \"Hi\"."); // escape character
		
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isDigit('A'));
		System.out.println(Character.isLetterOrDigit('\n'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.toLowerCase('A'));
		
	}

}
