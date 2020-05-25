package day18_OptionalAssignments;

import java.util.Scanner;

public class SameOrNot {
	
	/*
	Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.

	Input:
	abba

	Output:
	true
	*/
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		if (word.charAt(0) == word.charAt(word.length() - 1))
			System.out.println("true");
		else
			System.out.println("false");
	
	}
	
}
