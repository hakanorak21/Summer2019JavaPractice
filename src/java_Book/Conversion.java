package java_Book;

import java.util.Scanner;

public class Conversion 
{
	public static void main(String[] args) 
	{
		double centimeters;
		double inches;
		int meters;
		int feet;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program takes a single value in meters and contimeters");
		System.out.println("and converts it to a single value in feet and inches.");
		System.out.println("Enter the number of meters:");
		meters = keyboard.nextInt();
		System.out.println("Enter the number of centimeters:");
		centimeters = keyboard.nextDouble();
		centimeters = centimeters + (meters * 100);
		inches = 0.3937 * centimeters;
		feet = (int) (inches/12);
		inches = inches - feet * 12;
		System.out.println("The number of feet is: " + feet + ".");
		System.out.println("The number of inches is " + inches + ".");
		
	}

}
