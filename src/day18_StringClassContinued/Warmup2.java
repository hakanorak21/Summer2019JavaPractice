package day18_StringClassContinued;

import java.util.Scanner;

public class Warmup2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		/*
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		firstName = firstName.substring(0, 1).toUpperCase() +
					firstName.substring(1).toLowerCase();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		lastName = lastName.substring(0, 1).toUpperCase() +
					lastName.substring(1).toLowerCase();
		System.out.println(firstName + " " + lastName);
		*/
		
		System.out.println("Enter your first name");
		String firstName = scan.nextLine();
		firstName = ("" + firstName.charAt(0)).toUpperCase() +
					firstName.substring(1).toLowerCase();
		
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		lastName = ("" + lastName.charAt(0)).toUpperCase() +
					lastName.substring(1).toLowerCase();
		
		System.out.println(firstName + " " + lastName);
		
		
	}

}
