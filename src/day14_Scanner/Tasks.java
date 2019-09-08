package day14_Scanner;

import java.util.Scanner;

public class Tasks {
	
	public static void main(String[] args) {
		
		/*
		// Task 1. Calculating the sum of two numbers.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
		
		
		// Task 2. Returning the largest of three numbers.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		int z = keyboard.nextInt();
		
		if ((x == y) && (y == z))
			System.out.println("All numbers are equal.");
		else if (x == y){
			if (x > z)
				System.out.println(x + " is the largest number.");
			else
				System.out.println(z + " is the largest number.");
		}
		else if (x == z){
			if (x > y)
				System.out.println(x + " is the largest number.");
			else
				System.out.println(y + " is the largest number.");
		}
		else if (y == z){
			if (y > x)
				System.out.println(y + " is the largest number.");
			else
				System.out.println(x + " is the largest number.");
		}
		
		
		else {
		// x largest
		if ((x > y) && (x > z))
				System.out.println(x + " is the largest number.");
		// y largest  
		else if ((y > x) && (y > z))
			System.out.println(y + " is the largest number.");
		// z largest
		else 
			System.out.println(z + " is the largest number.");
		}
		*/
		
		// Task 3. Printing full name.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first name and last name: ");
		String first = keyboard.nextLine();
		String last = keyboard.nextLine();
		System.out.println("Your full name is " + first + " " + last);
		
	}

}
