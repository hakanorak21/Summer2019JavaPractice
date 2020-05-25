package day36_JavaReview;

import java.util.Scanner;

public class OptionalAssignment_Triples {
	
	/**
	a "triple" in a string is a char appearing three times in a row.
	Write a program that can print out the number of triples in the given string. 
	Example:
	input: abcXXXabc
	output: 1
	 
	Example:
	input: xxxabyyyycd
	output: 3
	 
	Example:
	input: java
	output: 0
	*/
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == str.charAt(i+1) && 
					str.charAt(i) == str.charAt(i+2))
				count++;
				//i += 2;
		}
		
		System.out.println(count);
		
	}

}
