package day18_OptionalAssignments;

import java.util.Scanner;

public class Concatenation01 {
	
	/*
	Ask user to enter two words. Then add them together and print.

	Input:
	one
	eight

	Output:
	oneeight
	 */
	
	public static void main(String[] args) {
		
		String word1, word2, output;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words:");
		word1 = keyboard.nextLine();
		word2 = keyboard.nextLine();
		
		output = word1.concat(word2);
		System.out.println(output);
		
	}

}
