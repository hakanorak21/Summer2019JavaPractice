package day17_StringClass;

import java.util.Scanner;

public class Warmup {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String fullName;
		 
		System.out.println("Enter first name and last name");
		String firstName = keyboard.nextLine();
		String lastName = keyboard.nextLine();
		 
		fullName = firstName.concat(" " + lastName);
		int num = fullName.length();
		System.out.println("Your full name has " + num + " characters.");
		//Last Character
		System.out.println("Last character: " + fullName.charAt(fullName.length()-1));
		
	}

}
