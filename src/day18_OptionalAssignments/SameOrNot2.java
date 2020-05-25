package day18_OptionalAssignments;

import java.util.Scanner;

public class SameOrNot2 {
	
	/*
	Ask user to enter two words. Print true is the first two characters of the first word and last two characters of the second word are same characters, print false otherwise.

	Input:
	banana
	abba

	Output:
	true
	*/
	
	public static void main(String[] args) {
		
		String word1, word2;
		System.out.println("Enter two words: ");
		Scanner input = new Scanner(System.in);
		word1 = input.nextLine();
		word2 = input.nextLine();
		
		if (word1.substring(0, 2).equals(word2.substring(word2.length()-2)))
			System.out.println("true");
		else
			System.out.println("false");
	
	}
	
}
