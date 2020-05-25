package day18_OptionalAssignments;

import java.util.Scanner;

public class StartEndWords {
	
	/*
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
	if either one not 5 chars length:    print "need to be exactly 5 chars length"
	if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
	if they do not match:  print "Buzz - did not match"
	*/

	public static void main(String[] args) {
		
		String word1, word2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words:\nOn different lines and\nEach 5 characters");
		word1 = keyboard.nextLine();
		word2 = keyboard.nextLine();
		
		if (word1.length() != word2.length())
			System.out.println("need to be exactly 5 chars length");
		
		else if (word1.length() == 5 && word2.length() == 5) {
			
			if (word1.charAt(4) == word2.charAt(0))
				System.out.println("Fizz");
			else 
				System.out.println("Buzz - did not match");
				
		}
			
	}
	
}
