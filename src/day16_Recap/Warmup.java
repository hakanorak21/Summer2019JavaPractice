package day16_Recap;

import java.util.Scanner;

public class Warmup {
	
	public static void main(String[] args) {
		
		String firstName, lastName;
		System.out.println("Enter your first name: ");
		Scanner keyboard = new Scanner (System.in);
		firstName = keyboard.nextLine();
		
		System.out.println("Enter your last name: ");
		Scanner keyboard2 = new Scanner (System.in);
		lastName = keyboard2.nextLine();
		
		String fullName = firstName.concat(" "+lastName).toUpperCase();
		System.out.println(fullName);
		

		
		
	}

}
