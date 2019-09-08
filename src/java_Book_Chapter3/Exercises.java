package java_Book_Chapter3;

import java.util.Scanner;
// enum Menu {a, b, c, d, e};

public class Exercises {
	
	public static void main(String[] args) {
		
		/*
		// Exercise 1
		System.out.print("Enter a score:");
        Scanner keyboard =  new Scanner(System.in);
        int score = keyboard.nextInt();
        
		if (score >= 0 && score <= 100)
			System.out.println("Valid score");
		else
			System.out.println("Invalid score");
		
		
		// Exercise 2
		System.out.print("Enter a whole number:");
        Scanner keyboard =  new Scanner(System.in);
        int number = keyboard.nextInt();
        
        if (number % 2 == 0) {
        	number /= 2;
        	System.out.println("The number divided by 2 is: " + number);
        }
        else {
        	number = number * 3 - 1;
        	System.out.println("The number multiplied by 3 minus 1 is: " + number);
        }
       	
		
		// Exercise 3
		System.out.print("Yes or no? ");
        Scanner keyboard =  new Scanner(System.in);
        String response = keyboard.next();
        
        boolean accept = false;
        
        switch (response) {
        
        case "Yes":
        	accept = true;
        	break;
        	
        case "Y":
        	accept = true;
        	break;
        
        case "y":
        	accept = true;
        	break;
        default:
        	accept = false;
        	break;
        
        System.out.println(accept);
		
		
		// Exercise 6.
		double check, fee;
		
		System.out.print("Enter check amount: ");
        
		Scanner keyboard =  new Scanner(System.in);
        check = keyboard.nextInt();
        System.out.printf("You have entered $%1.2f", check);
        System.out.println();
        
        if (check > 0) {
        	
        	if (check <= 10)
        		System.out.println("The fee amount is $1");
        	else if (check <= 100)
        		System.out.printf("The fee amount is: $%1.2f", check*(0.1));
        	else if (check <= 1000)
        		System.out.printf("The fee amount is: $%1.2f", (5 + check*(0.05)));
        	else
        		System.out.printf("The fee amount is: $%1.2f", (45 + check*(0.01)));
        	
        	
        	
        } else if (check == 0)
        	System.out.println("Check amount cannot be zero!");
        else
        	System.out.println("Check amount cannot be negative!");
		
        
        // Exercise 11. Converting letter grades to numeric grades.
		String grade;
		double gradeValue;
		
		System.out.print("Enter your letter grade: A, B, C, D, or F? ");
        
		Scanner keyboard =  new Scanner(System.in);
        grade = keyboard.next();
        System.out.println("You have entered " + grade);
       
		switch (grade) {
		
		case "A":
			System.out.println("Your numeric grade is 4.0");
			break;
		
		case "B":
			System.out.println("Your numeric grade is 3.0");
			break;
		
		case "C":
			System.out.println("Your numeric grade is 2.0");
			break;
		
		case "D":
			System.out.println("Your numeric grade is 1.0");
			break;
		
		case "F":
			System.out.println("Your numeric grade is 0.0");
			break;
		
		default:
			System.out.println("Error");
			break;
		
		}
		
		// Exercise 13. Menu choices a-e
		String choice;
		
		System.out.print("What would you like to eat: a, b, c, d, e ? ");
        
		Scanner keyboard =  new Scanner(System.in);
        choice = keyboard.next();
        System.out.println("You have entered " + choice);
        
        switch (choice) {
        
        case "a": 
        	System.out.println("You picked " + choice + ". Chicken");
        	break;
        
        case "b": 
        	System.out.println("You picked " + choice + ". Beef");
        	break;
        
        case "c": 
        	System.out.println("You picked " + choice + ". Veggie");
        	break;
        
        case "d": 
        	System.out.println("You picked " + choice + ". Pizza");
        	break;
        
        case "e": 
        	System.out.println("You picked " + choice + ". Sub");
        	break;
        
        default: 
        	System.out.println("Invalid choice!");
        	break;
        }
        
		
        // Exercise 14. Exercise 13 with enum
		
		String choice;
		
		System.out.print("What would you like to eat: a, b, c, d, e ? ");
		Scanner keyboard =  new Scanner(System.in);
        choice = keyboard.nextLine();
        
        switch (choice) {
        
        case a: 
        	System.out.println("Chicken");
        	break;
        
        case b: 
        	System.out.println("Beef");
        	break;
        
        case C: 
        	System.out.println("Veggie");
        	break;
        
        case D: 
        	System.out.println("Pizza");
        	break;
        
        case E: 
        	System.out.println("Sub");
        	break;
        
        }
		
		
		// Exercise 15. Repeat Exercise 13 with if-else
		String choice;
		
		System.out.print("What would you like to eat: a, b, c, d, e ? ");
		Scanner keyboard =  new Scanner(System.in);
        choice = keyboard.nextLine();
        
        if (choice.contentEquals("a"))
        	System.out.println("Chicken");
        else if (choice.contentEquals("b"))
        	System.out.println("Beef");
        else if (choice.contentEquals("c"))
        	System.out.println("Veggie");	
        else if (choice.contentEquals("d"))
        	System.out.println("Pizza");	
        else if (choice.contentEquals("e"))
        	System.out.println("Sub");
        else
        	System.out.println("Error");		
		
		
		// Exercise 16. Ternary Operator (correct label: degree or degrees)
		int temperature = 0;
		String label;
		
		System.out.print("Enter a temperature: ");
		Scanner keyboard =  new Scanner(System.in);
        temperature = keyboard.nextInt();
        
        if (temperature == 0)
        	label = "degrees";
        	else 
        		label = (temperature < 2) ? "degree" : "degrees";
        System.out.println("You entered " + temperature + " " + label + ".");
        */
		
	}

}
