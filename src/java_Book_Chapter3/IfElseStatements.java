package java_Book_Chapter3;

import java.util.Scanner;

public class IfElseStatements 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double temperature;
		System.out.println("Enter a temperature:");
		temperature = keyboard.nextInt();
		
		if (temperature <= 32)
		{
			System.out.println("It's freezing!");
			System.out.println("I don't want to go outside.");
		}
		else
		{
			System.out.println("It's not too cold.");
			System.out.println("Let's go for a walk.");
		}
		
	}

}
