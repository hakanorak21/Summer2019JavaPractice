package day19_ForLoop;

import java.util.Scanner;

public class Task02 {
	// Write a program that the user to declare a positive integer. 
	// It should then print the multiplication table of that number.
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number between 1 and 10: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		for (int i = 1; i <= 10; i++ )
			System.out.println(number + " x " + i + " = " + number * i);
		
	}

}
