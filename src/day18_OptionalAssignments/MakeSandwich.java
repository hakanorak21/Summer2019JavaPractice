package day18_OptionalAssignments;

import java.util.Scanner;

public class MakeSandwich {
	
	/*
	Ask user to enter two words. If the first word has even number of characters, print the first half of the first word, print the second word and print the second half of the first word.

	Input:
	banana
	apple

	Output:
	banappleana
	*/
	
	public static void main(String[] args) {
		
		String word1, word2, output = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words:");
		word1 = keyboard.nextLine();
		word2 = keyboard.nextLine();
		
		if (word1.length() % 2 == 0)
			output = word1.substring(0, word1.length() / 2) + word2 +
					word1.substring((word1.length() / 2), word1.length());
		
		System.out.println(output);
		
	}
}
