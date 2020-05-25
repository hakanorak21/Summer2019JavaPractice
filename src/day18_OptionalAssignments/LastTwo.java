package day18_OptionalAssignments;

import java.util.Scanner;

public class LastTwo {
	
	/*
	Ask user to enter a word. If the word has 2 or more characters, 
	print the word. But print by changing the places of the last two characters.

	Input:
	system

	Output:
	systme
	*/
	
	public static void main(String[] args) {
		
	System.out.println("Enter a word: ");
	Scanner input = new Scanner(System.in);
	String word = input.next();
	String output = null;
	
	if (word.length() >= 2)
		output = word.substring(0, word.length()-2) +
		word.charAt(word.length()-1) +
		word.charAt(word.length()-2);
	else
		System.out.println("too short");
	
	System.out.println(output);
	
	}

}
