package p1;

public class Demo {

	public static void main(String[] args) {
		String str = "A new String[] that combines the above three arrays. Each element of this new String[] is made of an\n" + 
				"integer (treated as a String) from the int[], a char (treated as a String) from the char[], and a String from\n" + 
				"the String[]";
		String str2 = "Hello! Hi, Bye";
		String[] words = str2.split("[!,]"); // regular Expression
		
		for(String s : words) { // enhanced for-loop
			System.out.println(s.trim());
		}
		
//		for(int i = 0; i < words.length; i++) {
//			System.out.println(words[i]);
//		}
	}

}
