package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			StringBuilder builder = new StringBuilder(s);
			System.out.println(builder.reverse().toString());
		}, "backwards");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			char[] letters = s.toCharArray();
			Random rand = new Random();
			int ran;
			String last = "";
			for(int i = 0; i < letters.length; i++) {
				ran = rand.nextInt(2);
				if(ran == 0) {
				last+=Character.toUpperCase(letters[i]);	
				} else {
					last+=Character.toLowerCase(letters[i]);
				}
			}
			System.out.println(last);
		}, "uppercase and lowercase");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			char[] letters = s.toCharArray();
			String last = "";
			for(char l : letters) {
				last+=l;
				last+=".";
			}
			System.out.println(last);
		}, "periods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String regEx = "[aeiou]";
			System.out.println(s.replaceAll(regEx, ""));
		}, "no more vowels");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
