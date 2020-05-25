package day18_OptionalAssignments;

import java.util.Scanner;

public class Concationation02 {
	
	/*
	Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

	Input:
	one
	eight

	Output:
	oneight
	*/
	
	public static void main(String[] args) {
		
		String word1, word2, output = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words:");
		word1 = keyboard.nextLine();
		word2 = keyboard.nextLine();
		
		
		if (word1.charAt(word1.length()-1) == word2.charAt(0))
			output = word1.concat(word2.substring(1));
			
		else
			output = word1.concat(word2);
		
		System.out.println(output);
		
	}
}
