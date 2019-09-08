package java_Book;

import java.util.Scanner;

public class Programming_Projects 
{
	public static void main(String[] args) 
	{
		/*
		// Project 1
		int F;
		double C;
		System.out.println("Please enter a temperature in degrees Fahrenheit:");
		Scanner keyboard = new Scanner(System.in);
		F = keyboard.nextInt();
		C = 5.0 * (F - 32)/9.0;
		System.out.print(F + " degrees Fahrenheit is ");
		System.out.printf("%1.1f", C);
		System.out.println(" degrees Celcius");
		
		// Project 2
		String text;
		System.out.println("Enter a line of text that includes hate:");
		Scanner keyboard = new Scanner(System.in);
		text = keyboard.nextLine();
		text = text.replace("hate", "love");
		System.out.println("I have rephrased that line to read:");
		System.out.println(text);
		
		// Project 3
		String line;
		System.out.println("Enter a sentence without any punctuation:");
		Scanner keyboard = new Scanner(System.in);
		line = keyboard.nextLine();
		
		// get the index of the start of the second word
	    int index = line.indexOf (' ');
	    // get the first char of the second word
	    char c = line.charAt(index+1);
	    // this is a bit ugly, yet necessary in order to convert the
	    //   first char to upper case 
	    String start = String.valueOf(c).toUpperCase(); 
	    // adding the rest of the sentence
	    start += line.substring (index+2);
	    // adding space to this string because we cut it
	    start += " ";
	    // getting the first word of the setence
	    String end = line.substring (0 , index);
	    // print the string
	    System.out.println(start + end);
		
		// Project 4. Favorite color, food, animal, and friend/relative.
		String color, food, animal, friend;
		
		System.out.println("Enter your favorite color:");
		Scanner keyboard = new Scanner(System.in);
		color = keyboard.nextLine();
		
		System.out.println("Enter your favorite food:");
		Scanner keyboard1 = new Scanner(System.in);
		food = keyboard1.nextLine();
		
		System.out.println("Enter your favorite animal:");
		Scanner keyboard2 = new Scanner(System.in);
		animal = keyboard2.nextLine();
		
		System.out.println("Enter the first name of a friend:");
		Scanner keyboard3 = new Scanner(System.in);
		friend = keyboard3.nextLine();
		
		System.out.println("I had a dream that " + friend + " ate a " +
							color + " " + animal);
		System.out.println("and he said it tasted like " + food + "!");
		
		
		// Project 5. Vending machine 
		
		int price, quarter, dime, nickel, change;
		
		System.out.println("Enter price of item");
		System.out.println("(from 25 cents to a dollar, in 5-cent increments:");
		
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
		
		change = 100 - price;
		quarter = change/25;
		change = change%25;
		
		dime = change/10;
		change = change%10;
		
		nickel = change/5;
		
		System.out.println("You bought an item for " + price + " cents" +
				" and gave me a dollar.");
		System.out.println("So, your change is:");
		System.out.println(quarter + " quarter(s)");
		System.out.println(dime + " dime(s)");
		System.out.println(nickel + " nickel(s)");
		
		
		// Project 6. Converting a 4-bit binary number to a decimal.
		int b0, b1, b2, b3;
		String binary;
		
		System.out.println("Enter a 4-bit binary number:");
		Scanner keyboard = new Scanner(System.in);
		binary = keyboard.nextLine();
		System.out.println("You entered " + binary + " and I will convert it to decimal.");
		// char b4 = binary.charAt(0);
		b0 = Character.getNumericValue(binary.charAt(0));
		b1 = Character.getNumericValue(binary.charAt(1));
		b2 = Character.getNumericValue(binary.charAt(2));
		b3 = Character.getNumericValue(binary.charAt(3));
		
		System.out.println(8*b0 + 4*b1 + 2*b2 + 1*b3);
		
		// Project 7. Taking radius in inches and depth in feet of a well and
		// calculating the gallons of water it can store.
		
		double radius, depth, water; 
		
		System.out.println("Enter the radius of the well in inches:");
		Scanner keyboard = new Scanner(System.in);
		radius = keyboard.nextInt();
		// System.out.println("You entered " + radius + "in for radius.");

		System.out.println("Enter the depth of the well in feet:");
		Scanner keyboard1 = new Scanner(System.in);
		depth = keyboard1.nextInt();
		// System.out.println("You entered " + depth + "ft for depth.");
		
		double radius_in_feet = radius / 12;
		water = Math.PI * radius_in_feet * radius_in_feet * depth;
		water *= 7.48;
		System.out.println("This well can hold " + (int)water + " gallons of water.");
		
		
		// Project 11. Thermal expansion
		double alpha=0, LDelta, TDelta, displacement;
		String material;
		
		System.out.println("Please enter the material: Aluminum, Copper, Glass, or Steel?");
		Scanner keyboard = new Scanner(System.in);
		material = keyboard.nextLine();
		
		System.out.println("Please enter the displacement in meters: ");
		Scanner keyboard1 = new Scanner(System.in);
		displacement = keyboard1.nextDouble();
		
		System.out.println("Please enter the change in temperature in Celcius: ");
		Scanner keyboard2 = new Scanner(System.in);
		TDelta = keyboard2.nextDouble();
		
		System.out.println("You have entered " + material);
		System.out.println("The displacement: " + displacement);
		System.out.println("The change in temperature: " + TDelta);
		
		if (material.contentEquals("Aluminum")) {
			
			alpha = 2.31e-5;
			System.out.println("For " + material + ", the amount of displacement is: ");
			System.out.println(alpha * displacement * TDelta);
			
		} else if (material.contentEquals("Copper")){
			
			alpha = 1.70e-5;
			System.out.println("For " + material + ", the amount of displacement is: ");
			System.out.println(alpha * displacement * TDelta);
			
		} else if (material.contentEquals("Glass")){
			
			alpha = 8.50e-6;
			System.out.println("For " + material + ", the amount of displacement is: ");
			System.out.println(alpha * displacement * TDelta);
			
		} else if (material.contentEquals("Steel")){
			
			alpha = 1.20e-5;
			System.out.println("For " + material + ", the amount of displacement is: ");
			System.out.println(alpha * displacement * TDelta);
			
		} else {
			
			System.out.println("Please run the program again and enter valid material name.");
			
		}
		*/
		
		
		
		
		
	}

}
