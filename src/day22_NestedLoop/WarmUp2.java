package day22_NestedLoop;

import java.util.Scanner;

	public class WarmUp2 {
	
	/*
	 Write a program that can check if the String is palindrome. 
	 if it's print "true", otherwise print "false"    
	 DO NOT USE FOR LOOP
        Ex: input: level
            output: true,  (because reversed value is still "level")
	 */
		
		public static void main(String[] args) {
			
			/*
			// My way
			Scanner keyboard = new Scanner(System.in);
			boolean isPalindrome = false;
			System.out.println("Enter a word: ");
			String str = keyboard.nextLine();
	
			int count = 0;
			while (count < str.length()/2) {
		
				if (str.charAt(count) == str.charAt(str.length() - ++count))
					isPalindrome = true;
				else
					isPalindrome = false;
			}
			
			System.out.println(isPalindrome);

			*/
			
			// Reversing the string
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a word: ");
			String original = keyboard.nextLine();
			String reversed = "";
			
			/*
			for (int i = original.length() - 1; i >= 0; i--) {
				reversed += original.substring(i, i + 1);
			//	reversed += original.charAt(i);
			}
			*/
			
			//While loop
			int i = original.length() - 1;
			
			while (i >= 0) {
				reversed += original.charAt(i);
				i--;
			}
			
			System.out.println(reversed.equalsIgnoreCase(original));
		
	}

}
