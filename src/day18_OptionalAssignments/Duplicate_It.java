package day18_OptionalAssignments;

import java.util.Scanner;

public class Duplicate_It {
	
	/*
	Ask user to enter two words. Print the first word, second word, second word, first word

	Input:
	one
	two

	Output:
	onetwotwoone
	 */
	
	public static void main(String[] args) {
	
		String firstWord, secondWord;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two words: ");
		firstWord = keyboard.next();
		secondWord = keyboard.next();
		
		System.out.println(firstWord.concat(secondWord).concat(secondWord).concat(firstWord));
		
	}

}
