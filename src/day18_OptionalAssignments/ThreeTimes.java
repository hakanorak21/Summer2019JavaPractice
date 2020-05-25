package day18_OptionalAssignments;

import java.util.Scanner;

public class ThreeTimes {
	
	/*
	Ask user to enter a word. If the word has 2 more more characters, 
	print first 2 characters of the word three times 
	
	Input:
	apple

	Output:
	apapap
	*/
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		String output = null;
		
		if (word.length() >= 2)
			output = word.substring(0, 2) + word.substring(0, 2) +
						word.substring(0, 2);
		else
			System.out.println("too short");
		
		System.out.println(output);
		
		}

}
