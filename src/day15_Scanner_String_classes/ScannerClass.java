package day15_Scanner_String_classes;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		/*
		boolean input;
		System.out.println("Enter a boolean: true or false?");
		input = keyboard.nextBoolean();
		System.out.println("You entered " + input + ".");
		
		System.out.println("Enter double number:");
		double input = keyboard.nextDouble();
		System.out.println("You entered " + input);
		*/
		
		System.out.println("Enter your first name:");
		String str = keyboard.nextLine();
		System.out.println(str);
		
	}

}
