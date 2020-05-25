package day18_OptionalAssignments;

import java.util.Scanner;

public class MakeThemEqual {
	
	/*
	Ask user to enter two words. If they are equal length, print them together. 
	If one is longer than the other one, print equal number of characters from the short one.

	Input:
	book
	pen

	Output:
	boopen
	*/
	
	public static void main(String[] args) {
		
		String word1, word2, output = null;
		System.out.println("Enter two words: ");
		Scanner input = new Scanner(System.in);
		word1 = input.nextLine();
		word2 = input.nextLine();
		
		if (word1.length() == word2.length())
			output = word1 + word2;
		
		else if (word1.length() > word2.length())
			output = word1.substring(0, word2.length()) + word2;
		else
			output = word1 + word2.substring(0, word1.length());
				
		System.out.println(output);
	}

}
