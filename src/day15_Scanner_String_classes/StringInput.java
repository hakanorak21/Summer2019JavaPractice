package day15_Scanner_String_classes;

import java.util.Scanner;

public class StringInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		System.out.println("Your full name is " + firstName + " " + lastName + ".");
		
	}

}
