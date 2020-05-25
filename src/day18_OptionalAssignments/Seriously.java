package day18_OptionalAssignments;

import java.util.Scanner;

public class Seriously {
	
	/*
	Ask user to enter a word. Print "really?"  
	if the word ends with ly, print "never mind" otherwise.

	Input:
	Seriously

	Output:
	really?
	*/
	
	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner input = new Scanner(System.in);
		String word = input.next();
		
		if (word.endsWith("ly"))
			System.out.println("really?");
		else
			System.out.println("never mind");
		
		String output = (word.endsWith("ly"))? "really?": "never mind";
		System.out.println(output);
		
	}
	
	
}
