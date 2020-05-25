package day18_OptionalAssignments;

import java.util.Scanner;

public class Substring02 {
	
	 /*
	 Ask user to enter a word. If the first or second or 
	 both letter of the word is x, print the word without x(s). 
	 If x is the third letter it should be printed. 
	 If the first and second are x, both should be ignored.

	 Input:
	 xxode

	 Output:
	 ode

	 Input:
	 oxidex

	 Output:
	 oidex
	 */
	
	public static void main(String[] args) {
		
		String word, output = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		word = input.next();
		
		if (word.charAt(0) == 'x' && word.charAt(1) == 'x')
			output = word.substring(2);
		else if (word.charAt(1) == 'x') 
			output = word.substring(0, 1) + word.substring(2);
		else if (word.charAt(0) == 'x') 
			output = word.substring(1);
		
		System.out.println(output);
			
		
	}

}
