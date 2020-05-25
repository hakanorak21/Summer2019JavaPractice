package day18_OptionalAssignments;

import java.util.Scanner;

public class CheckWords {
	
	/*
	
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
	 
	 */
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		String word1, word2, word3;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three words on different lines: ");
		word1 = keyboard.nextLine();
		word2 = keyboard.nextLine();
		word3 = keyboard.nextLine();
		
		num1 = word1.length();
		num2 = word2.length();
		num3 = word3.length();
		
		if (num1 == num2 && num2 == num3)
			System.out.println("All words are same length");
		else if (num1 == num2 || num2 == num3)
			System.out.println("Not Same nor Different lengths");
		else
			System.out.println("All different length");
			
	}

}
