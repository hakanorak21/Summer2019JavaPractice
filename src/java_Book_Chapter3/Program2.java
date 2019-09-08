package java_Book_Chapter3;

import java.util.Scanner;

public class Program2 {
	
	public static void main(String[] args) {
		
	
	
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
	        
	}

}
