package day36_JavaReview;

import java.util.Scanner;

public class OptionalAssignment_RepeatSeparator {
	
	/**
	Given two strings, word and a separator sep,

	Scanner scan = new Scanner(System.in);
	String word = scan.next();
	String separator = scan.next();

	int count = scan.nextInt( );

	return a big string made of count occurrences of the word, separated by the separator string.
			
	Example:
	input: Word
	input: X
	input: 3
	output: WordXWordXWord
	 
	Example:
	input: This
	input: And
	input: 2
	output: ThisAndThis
	 
	Example:
	input: This
	input: And
	input: 1
	output: This
	*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt( );
		
		String result = "";
		for (int i = 0; i < count-1; i++)
			result += word + separator;
		result += word;
		System.out.println(result);
		
	}

}
