package java_Book_Chapter3;

import java.util.Scanner;

public class PracticePrograms {
	
	public static void main(String[] args) {
		
		/*
		// Program 1. Divisibility
		int x, y;
		
		System.out.print("Enter two whole numbers: ");
        
		Scanner keyboard =  new Scanner(System.in);
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        
        if (x % y == 0)
        	System.out.println(x + " is divisible by " + y);
        else
        	System.out.println(x + " is not divisible by " + y);
		
		
        // Program 2. Displaying integers in increasing order
        int x, y, z;
        
        System.out.print("Enter three different whole numbers: ");
        System.out.println();
        
		Scanner keyboard =  new Scanner(System.in);
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        z = keyboard.nextInt();
        
        if (x > y && x > z) {
        	if (y > z)
        		System.out.println(z + ", " + y + ", " + x);
        	else
        		System.out.println(y + ", " + z + ", " + x);
        }
        
        else if (y > z && y > x) {
            	if (x > z)
            		System.out.println(z + ", " + x + ", " + y);
            	else
            		System.out.println(x + ", " + z + ", " + y);
        }
        
        else if (z > x && z > y) {
                	if (x > y)
                		System.out.println(y + ", " + x + ", " + z);
                	else
                		System.out.println(x + ", " + y + ", " + z);
        }
        
        else
        	System.out.println("Invalid entry");
		
		
		// Program 3. Arranging strings lexicographically.
		String x, y, z;
        
        System.out.print("Enter three lines of text: ");
        System.out.println();
        
		Scanner keyboard =  new Scanner(System.in);
        x = keyboard.nextLine();
        y = keyboard.nextLine();
        z = keyboard.nextLine();
         
        // Checking for y
        if ((x.compareTo(y) < 0) && (y.compareTo(z) < 0) ||
        		(z.compareTo(y) < 0) && (y.compareTo(x) < 0))
        		System.out.println(y + " is second lexicographically.");
        
        // Checking for x
        else if ((y.compareTo(x) < 0) && (x.compareTo(z) < 0) ||
        		(z.compareTo(x) < 0) && (x.compareTo(y) < 0))
        		System.out.println(x + " is second lexicographically.");
        
        // Checking for z
        else
        	System.out.println(z + " is second lexicographically.");
        
        
		// Program 4. Responding to user input
		
		String input;
        
        System.out.print("Enter one-line sentence: ");
        System.out.println();
        
		Scanner keyboard =  new Scanner(System.in);
        input = keyboard.nextLine();
        
        char lastChar = input.charAt(input.length()-1);
        
        switch (lastChar) {
        	
        	case '?':
        	if ((input.length()-1)%2 == 0)
        		System.out.println("Yes, # of characters is divisible by 2.");
        	else
        		System.out.println("No, # of characters is not divisible by 2.");
        	break;
        	
        	case '!':
        	System.out.println("Wow");
        	break;
        	
        	default:
        	System.out.println("You always say " + "\"" + input + "\"");
        	
        }
        
        System.out.println(input.length()-1 + " characters.");
        
		
		// Program 5. Converting temperatures
		int temperature;
		String unit;
        
        System.out.println("Enter temperature in celcius or fahrenheit");
        System.out.println("followed by the unit (such as 90 F or 20 C)");
        System.out.println("and I will convert it to the other unit.");
        
		Scanner keyboard =  new Scanner(System.in);
        temperature = keyboard.nextInt();
        unit = keyboard.next();
        
        System.out.println("You entered " + temperature + unit);
        
        
        if (unit.equals("F") || unit.equals("f")) {
        	System.out.print(temperature + " " + unit + " is equal to ");
        	temperature = 5 * (temperature - 32) / 9;
        	System.out.println(temperature + " C");
        }
        
        else if (unit.equals("C") || unit.equals("c")) {
        	System.out.print(temperature + " " + unit + " is equal to ");
        	temperature = 9 * (temperature / 5) + 32;
        	System.out.println(temperature + " F");
        }
        
        else
        	System.out.println("Invalid unit!");
        
        
        switch (unit) {
        
        	case "F": case "f":
        	System.out.print(temperature + " " + unit + " is equal to ");
        	temperature = 5 * (temperature - 32) / 9;
        	System.out.println(temperature + " C");
        	break;
        
        	case "C": case "c":
        	System.out.print(temperature + " " + unit + " is equal to ");
        	temperature = 9 * (temperature / 5) + 32;
        	System.out.println(temperature + " F");
        	break;
        	
        	default:
        	System.out.println("Invalid unit!");
        			
        }
        
		
		// Program 6. Yes or no
		// > 100 or between 50 and 75 (inclusive) => YES
		// Otherwise => NO
		
		System.out.println("Enter a whole number: ");
		Scanner keyboard =  new Scanner(System.in);
        int number = keyboard.nextInt();
        
        if (number > 100 || (number >= 50 && number <= 75))
        	System.out.println("YES");
        else 
        	System.out.println("NO");
        */
		
		// Program 7. Blood alcohol content (BAC)
		// BAC = (4.136 * numDrinks * ouncesAlcohol) / weight
		// 0.55 ounces of alcohol in one drink of Jagerbombs
		
		Scanner keyboard =  new Scanner(System.in);
        
		System.out.println("Enter your number of drinks: ");
		int numDrinks = keyboard.nextInt();
		
		System.out.println("Enter your weight: ");
		int weight = keyboard.nextInt();
		
		double BAC = (4.136 * numDrinks * 0.55) / weight;
		
		System.out.printf("Your blood alcohol content (BAC) is %1.3f", BAC);
        
	}

}
