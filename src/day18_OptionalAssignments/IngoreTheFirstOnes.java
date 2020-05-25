package day18_OptionalAssignments;

import java.util.Scanner;

public class IngoreTheFirstOnes {
	
	/*
	Ask user to enter two words. Print first word without its first character then print the second word without its first character.

	Input:
	apple
	banana

	Output:
	ppleanana
	*/
	
	public static void main(String[] args) {
		
	String word1, word2, output = null;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter two words:");
	word1 = keyboard.next();
	word2 = keyboard.next();
	
	output = word1.substring(1) + word2.substring(1);
	
	System.out.println(output);
	
	}

}
