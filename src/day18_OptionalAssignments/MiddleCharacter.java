package day18_OptionalAssignments;

import java.util.Scanner;

public class MiddleCharacter {
	
	/*
	Write a Java method to display the middle character of a string. Go to the editor
	a) If the length of the string is even there will be two middle characters.
	b) If the length of the string is odd there will be one middle character.


	Input:
	Input a string: elephant 
	Output:

	The middle character in the string: ph
	*/
	
	public static void main(String[] args) {
		
	String name;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	name = keyboard.nextLine();
	
	if (name.length() % 2 == 0) 
		System.out.println("The middle character of the string is: " + 
			name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
	else {
		System.out.print("The middle character of the string is: ");
		System.out.println(name.charAt((name.length() - 1) / 2));
	}
	
	}

}
