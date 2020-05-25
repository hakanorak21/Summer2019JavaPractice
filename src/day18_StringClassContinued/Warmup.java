package day18_StringClassContinued;

import java.util.Scanner;

public class Warmup {
	
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in); 
		String firstName, lastName;
		
		System.out.println("Enter your first and last names:");
		firstName = name.nextLine();
		lastName = name.nextLine();
		
		// String initials = firstName.substring(0,1).concat(".") + 
		//					lastName.substring(0,1).concat("."); 
		
		String initials = "" + firstName.charAt(0) + "." + lastName.charAt(0) + ".";
		initials = initials.toUpperCase();
		System.out.println(initials);
		System.out.println((firstName.charAt(0) + "." + lastName.charAt(0) + ".").toUpperCase());
		
		//Printing last letters
		int firstNameIndex = firstName.length() - 1;
		int lastNameIndex = lastName.length() - 1;
		//String lastLetters = "" + firstName.charAt(firstNameIndex) +
		//		"." + lastName.charAt(lastNameIndex) + ".";
		String lastLetters = firstName.substring(firstNameIndex) + "." +
								lastName.substring(lastNameIndex) + ".";
		lastLetters = lastLetters.toLowerCase();
		System.out.println(lastLetters);
		
		
	}

}
