package day18_OptionalAssignments;

import java.util.Scanner;

public class Substring01 {
	
	/*
	Ask user to enter a word. If the work contains starts with x, print the word without x.

	Input:
	xcode

	Output:
	code
	*/
	
	public static void main(String[] args) {
		
		String word;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		word = input.next();
		
		if (word.charAt(0) == 'x' || word.charAt(0) == 'X')
			System.out.println(word.substring(1));
		else
			System.out.println(word);
		
	}
}
