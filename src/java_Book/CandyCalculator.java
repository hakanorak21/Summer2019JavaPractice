package java_Book;

import java.util.Scanner;

public class CandyCalculator 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		int weight;
		int height;
		
		System.out.println("This program will calculate the number of 230 calories...");
		System.out.println("What is your age in years?");
		age = keyboard.nextInt();
		System.out.println("What is your weight in pounds?");
		weight = keyboard.nextInt();
		System.out.println("What is your height in inches?");
		height = keyboard.nextInt();
		
		double caloriesMale, caloriesFemale;
		
		caloriesMale = 655 + (4.3*weight) + (4.7*height) - (4.7*age);
		caloriesFemale = 66 + (6.3*weight) + (12.9*height) - (6.8*age);
		System.out.println("A female with those measurements should eat " + 
				(caloriesFemale / 230) + 
				" candy bars per day to maintain weight.");
		System.out.println("A male with those measurements should eat " + 
				(caloriesMale / 230) + 
				" candy bars per day to maintain weight.");
		
		
		
		
	}

}
