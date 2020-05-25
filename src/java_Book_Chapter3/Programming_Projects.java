package java_Book_Chapter3;

import java.util.Scanner;

public class Programming_Projects {
	
	public static void main(String[] args) {
		
		/*
		// Project 1. Vending machine from Chapter 2 Project 5 
		int price, quarter, dime, nickel, change;
				
		System.out.println("Enter price of item");
		System.out.println("from 25 cents to a dollar, in 5-cent increments:");
				
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt();
				
		// Input checking
		if (price >= 25 && price <= 100 && price % 5 == 0) {
				
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
		}
				
		else {
			System.out.println("Invalid input");
		}
		
		
		//Project 3. Filtering out profanity
		System.out.println("Enter a sentence (no profanity!):");
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.nextLine();
		
		sentence = sentence.toLowerCase();
		if (sentence.contains("cat")) {
			if (((sentence.indexOf("cat") != 0) && 
				 (sentence.charAt(sentence.indexOf("cat") - 1) ) == ' ') &&
				((sentence.indexOf("cat") != sentence.length() - 3) &&
				 (sentence.charAt(sentence.indexOf("cat") + 3)) == ' '))
				System.out.println("No profanity!");
			
			else if (sentence.indexOf("cat") == 0)
				System.out.println("No profanity!");
			else if (sentence.indexOf("cat") == (sentence.length() - 3) ||
					sentence.indexOf("cat") == (sentence.length() - 4))
				System.out.println("No profanity!");
			
		}	
		if (sentence.contains("dog")) {
			if (((sentence.indexOf("dog") != 0) && 
				 (sentence.charAt(sentence.indexOf("dog") - 1) ) == ' ') &&
				((sentence.indexOf("dog") != sentence.length() - 3) &&
				 (sentence.charAt(sentence.indexOf("dog") + 3)) == ' '))
				System.out.println("No profanity!");
			
			else if (sentence.indexOf("dog") == 0)
				System.out.println("No profanity!");
			else if (sentence.indexOf("dog") == (sentence.length() - 3)||
					sentence.indexOf("dog") == (sentence.length() - 4))
				System.out.println("No profanity!");
			
		}
		if (sentence.contains("llama")) {
			if (((sentence.indexOf("llama") != 0) && 
				 (sentence.charAt(sentence.indexOf("llama") - 1) ) == ' ') &&
				((sentence.indexOf("llama") != sentence.length() - 5) &&
				 (sentence.charAt(sentence.indexOf("llama") + 5)) == ' '))
				System.out.println("No profanity!");
			
			else if (sentence.indexOf("llama") == 0)
				System.out.println("No profanity!");
			else if (sentence.indexOf("llama") == (sentence.length() - 4)||
					sentence.indexOf("llama") == (sentence.length() - 5))
				System.out.println("No profanity!");
			
		}
		
		
		// Project 4. Checking the validity of a given date
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter date as mm/dd/yyyy");
		String date = keyboard.nextLine();
		
		int month = Integer.parseInt(date.substring(0, 2));
		int day = Integer.parseInt(date.substring(3, 5));
		int year = Integer.parseInt(date.substring(6));
		
		switch (month) {
		case 4: case 6: case 9: case 11:
			if (day <1 || day > 30)
				System.out.println("For month " + month + ", # of days should be 1-30");
			else
				System.out.println(date + "is a valid date");
		break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day < 1 || day > 31)
				System.out.println("For month " + month + ", # of days should be 1-31");
			else
				System.out.println(date + "is a valid date");
		break;
		
		case 2:
			if (year %4 != 0 && day > 0 && day <= 28)
				System.out.println(date + " is a valid date");
			else if (year %4 == 0 && year %100 != 0 && year %400 == 0 && day > 0 && day <= 29)
				System.out.println(date + " is a valid date");
			else if (year %4 == 0 && day > 0 && day <= 28)   				
				System.out.println(date + " is a valid date");
			else
				System.out.println("Invalid date");
		break;
							
		}
		
		
		// Project 5. Calorie calculation based on gender
		System.out.println("Enter your gender:");
		Scanner keyboard = new Scanner(System.in);
		String gender = keyboard.nextLine();
		
		switch (gender) {
		case "M": case "m":
			System.out.println("Male calorie calculation");
			break;
		case "W": case "w":
			System.out.println("Female calorie calculation");
			break;
		default:
			System.out.println("Invalid entry!");
			
		}
		
		
		// Project 6. Repeat 5 with exercise habit
		System.out.println("Enter your exercise habit (pick one):");
		System.out.println("a. Sedentary?");
		System.out.println("b. Somewhat active (exercise occasionally)?");
		System.out.println("c. Active (exercise 3-4 days per week)?");
		System.out.println("d. Highly active (exercise every day)?");
		
		
		int BMR = 100;
		Scanner keyboard = new Scanner(System.in);
		String choice = keyboard.next();
				
		switch (choice) {
				case "a": case "A":
					BMR *= 1.2;
					break;
				case "b": case "B":
					BMR *= 1.3;
					break;
				case "c": case "C":
					BMR *= 1.4;
					break;
				case "d": case "D":
					BMR *= 1.5;
					break;
				default:
					System.out.println("Invalid entry!");
					
				}
		System.out.println("Adjusted BMR: " + BMR);
		
		
		//Repeat Project 11 in Chapter 2
		//Either, material will expand by
		//Or, material will contract by
		
		double alpha = 0, LDelta, TDelta, displacement;
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
		
		switch (material) {
		
		case "aluminum": case "Aluminum":
			alpha = 2.31e-5;
			break;
		
		case "copper": case "Copper":
			alpha = 1.70e-5;
			break;
			
		case "glass": case "Glass":
			alpha = 8.50e-6;
			break;
			
		case "steel": case "Steel":
			alpha = 1.20e-5;
			break;
			
		default:
			System.out.println("Please run the program again and enter valid material name.");
						
		}
		
		if (TDelta >= 0) {
			System.out.print("The " + material + " will expand by ");
			System.out.println(alpha * displacement * TDelta);
		} else {
			System.out.print("The " + material + " will contract by ");
			System.out.println(-alpha * displacement * TDelta);
		}
				
		
		//Project 8. Rock-paper-scissor game
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Player 1: Rock, paper, or scissor?");
		System.out.println("Enter R for rock, P for paper, or S for scissor");
		String player1 = keyboard.nextLine();
		
		System.out.println("Player 2: Rock, paper, or scissor?");
		System.out.println("Enter R for rock, P for paper, or S for scissor");
		String player2 = keyboard.nextLine();
		
		if (player1.equals("P") && player2.equals("R"))
			System.out.println("Paper covers rock");
		
		else if (player1.equals("R") && player2.equals("S"))
			System.out.println("Rock breaks scissor");
		
		else if (player1.equals("S") && player2.equals("P"))
			System.out.println("Scissor cuts paper");
		
		else
			System.out.println("Nobody wins");
		
		
		//Project 11. What kind of haircut?
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Male or Female?");
		String gender = keyboard.nextLine();
		
		if (gender.equalsIgnoreCase("male")) {
			System.out.println("Superhero or Super villain?");
			String choice2 = keyboard.nextLine();
			
			if (choice2.equalsIgnoreCase("Superhero")) {
				System.out.println("Steak or sushi?");
				String choice3 = keyboard.nextLine();
				if (choice3.equalsIgnoreCase("Steak"))
					System.out.println("You should get a flat top");
				else if (choice3.equalsIgnoreCase("Sushi"))
					System.out.println("You should get a pompadour");	
			}
			else if (choice2.equalsIgnoreCase("Super villain")) {
				System.out.println("You should get a mohawk");
			}	
			
		}
		else if (gender.equalsIgnoreCase("female")) {
			System.out.println("Superhero or Super villain?");
			String choice2 = keyboard.nextLine();
			
			if (choice2.equalsIgnoreCase("Superhero")) {
				System.out.println("Anime or Sitcom?");
				String choice3 = keyboard.nextLine();
				if (choice3.equalsIgnoreCase("Anime"))
					System.out.println("You should go with bangs");
				else if (choice3.equalsIgnoreCase("Sitcom"))
					System.out.println("You should get a bob");	
			}
			else if (choice2.equalsIgnoreCase("Super villain")) {
				System.out.println("You should get a mohawk");
			}	
		
		}
		else
			System.out.println("Invalid entry");
		*/
		
		//Project 12. Time elapsed
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter time from in HH:MM:SS AM/PM format:");
		String start = keyboard.nextLine();
		
		System.out.println("Enter time to in HH:MM:SS AM/PM format:");
		String end = keyboard.nextLine();
		
		int hourStart = Integer.parseInt(start.substring(0, 2));
		int hourEnd = Integer.parseInt(end.substring(0, 2));
		int minuteStart = Integer.parseInt(start.substring(3, 5));
		int minuteEnd = Integer.parseInt(end.substring(3, 5));
		int secondStart = Integer.parseInt(start.substring(6, 8));
		int secondEnd = Integer.parseInt(end.substring(6, 8));
		
		if (start.substring(9).equals(end.substring(9))) {
			
			if (secondEnd >= secondStart)
				secondEnd -= secondStart;
			else {
				secondEnd = secondEnd + 60 - secondStart;
				minuteEnd--;
			}
			
			if (minuteEnd >= minuteStart)
				minuteEnd -= minuteStart;
			else {
				minuteEnd = minuteEnd + 60 - minuteStart;
				hourEnd--;
			}
			
			if (hourEnd >= hourStart)
				hourEnd -= hourStart;
			else 
				hourEnd = hourEnd + 12 - hourStart;
		}
		
		else {
			
			if (secondEnd >= secondStart)
				secondEnd -= secondStart;
			else {
				secondEnd = secondEnd + 60 - secondStart;
				minuteEnd--;
			}
			
			if (minuteEnd >= minuteStart)
				minuteEnd -= minuteStart;
			else {
				minuteEnd = minuteEnd + 60 - minuteStart;
				hourEnd--;
			}
			
			if (hourEnd >= hourStart)
				hourEnd -= hourStart;
			else 
				hourEnd = hourEnd + 12 - hourStart;
			
		}

		if (hourEnd == 1)
			System.out.print(hourEnd + " hour, ");
		else if (hourEnd > 1)
			System.out.print(hourEnd + " hours, ");
		
		if (minuteEnd == 1)
			System.out.print(minuteEnd + " minute, ");
		else if (minuteEnd > 1)
			System.out.print(minuteEnd + " minutes, ");
		
		if (secondEnd == 1)
			System.out.print(secondEnd + " second");
		else if (secondEnd > 1)
			System.out.print(secondEnd + " seconds");
		
	}

}
